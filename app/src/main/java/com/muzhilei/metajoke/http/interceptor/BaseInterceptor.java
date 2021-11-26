package com.muzhilei.metajoke.http.interceptor;

import com.muzhilei.metajoke.utils.StaticClass;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Homjay on 2021/8/2.
 * 处理多个baseUrl做拦截器
 */
public class BaseInterceptor implements Interceptor {
    private Map<String, String> headers;

    public BaseInterceptor(Map<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
//        Request.Builder builder = chain.request()
//                .newBuilder();
//        if (headers != null && headers.size() > 0) {
//            Set<String> keys = headers.keySet();
//            for (String headerKey : keys) {
//                builder.addHeader(headerKey, headers.get(headerKey)).build();
//            }
//        }
//        //请求信息
//        return chain.proceed(builder.build());

        //获取原始的originalRequest
        //获取request
        Request request = chain.request();
        //从request中获取原有的HttpUrl实例oldHttpUrl
        HttpUrl oldHttpUrl = request.url();
        //获取request的创建者builder
        Request.Builder builder = request.newBuilder()
                .addHeader("Content-Type", "application/json");
        //从request中获取headers，通过给定的键url_type
        List<String> headerValues = request.headers(StaticClass.HEADER_KEY);
        if (headerValues != null && headerValues.size() > 0) {
            //如果有这个header，先将配置的header删除，因此header仅用作app和okhttp之间使用
            builder.removeHeader(StaticClass.HEADER_KEY);
            //匹配获得新的BaseUrl
            String headerValue = headerValues.get(0);
            HttpUrl newBaseUrl = null;
            if ("device".equals(headerValue)) {
                newBaseUrl = HttpUrl.parse(StaticClass.baseDeviceUrl);
            }else{
                newBaseUrl = oldHttpUrl;
            }
            //重建新的HttpUrl，修改需要修改的url部分
            HttpUrl newFullUrl = oldHttpUrl
                    .newBuilder()
                    .scheme(newBaseUrl.scheme())//更换网络协议
                    .host(newBaseUrl.host())//更换主机名
                    .port(newBaseUrl.port())//更换端口
//                            .removePathSegment(0)//移除第一个参数
                    .build();
            //重建这个request，通过builder.url(newFullUrl).build()；
            // 然后返回一个response至此结束修改
            return chain.proceed(builder.url(newFullUrl).build());
        }
        return chain.proceed(request);


    }
}