package com.muzhilei.metajoke.utils;

public class StaticClass {

    //测试地址
//    public static final String baseUserUrl = "http://120.78.187.33:6789";//用户相关端口
//    public static final String baseDeviceUrl = "http://120.78.187.33:6789";//设备相关端口

    public static final String baseUserUrl = "http://120.78.187.33:9981";//用户相关端口
    public static final String baseDeviceUrl = "http://120.78.187.33:8864";//设备相关端口

//    public static final String baseUserUrl = "http://172.16.12.43:9981";//用户相关端口
//    public static final String baseDeviceUrl = "http://172.16.12.43:8864";//设备相关端口

    public static  String HEADER_KEY = "url_type";

    //打印机SDK 初始值
    public static String LICENSE = "BT8Q9AIH3YWP";
    public static String VENDOR = "rqzy";

    //eventBus事件名
    public class Event {
        public static final String EVENT_WIFI_NAME = "EVENT_WIFI_NAME";//wifi名称
        public static final String EVENT_WIFI_PASSWORD = "EVENT_WIFI_PASSWORD";//wifi名称

    }

    //缓存名
    public class SpName{

        public static final String SP_USER_NAME = "SP_USER_NAME";//账号
        public static final String SP_PASS_WORD = "SP_PASS_WORD";//密码
        public static final String SP_TOKEN = "SP_TOKEN";//token
        public static final String SP_USER_ID = "SP_USER_ID";//userId

    }

    //打印机状态
    public class PrintStatus{

        public static final String PRINTER_STATUS_IDLE = "idle";//空闲
        public static final String PRINTER_STATUS_PROCESSING = "processing";//打印中
        public static final String PRINTER_STATUS_ERROR = "error";//错误
        public static final String PRINTER_STATUS_SLEEP = "sleep";//睡眠
        public static final String PRINTER_STATUS_OFF = "off";//关机
        public static final String PRINTER_STATUS_UPDATING = "updating";//关机

        //错误code
        public static final String PRINTER_STATUS_ERROR_5004 = "-5004";
        public static final String PRINTER_STATUS_ERROR_6002 = "-6002";
        public static final String PRINTER_STATUS_ERROR_7001 = "-7001";
        public static final String PRINTER_STATUS_ERROR_7002 = "-7002";
        public static final String PRINTER_STATUS_ERROR_7101 = "-7101";
        public static final String PRINTER_STATUS_ERROR_7102 = "-7102";
        public static final String PRINTER_STATUS_ERROR_7103 = "-7103";
        public static final String PRINTER_STATUS_ERROR_7104 = "-7104";
        public static final String PRINTER_STATUS_ERROR_7105 = "-7105";
        public static final String PRINTER_STATUS_ERROR_7106 = "-7106";
        public static final String PRINTER_STATUS_ERROR_7107 = "-7107";
        public static final String PRINTER_STATUS_ERROR_7108 = "-7108";
        public static final String PRINTER_STATUS_ERROR_7201 = "-7201";
        public static final String PRINTER_STATUS_ERROR_7202 = "-7202";
        public static final String PRINTER_STATUS_ERROR_7203 = "-7203";
        public static final String PRINTER_STATUS_ERROR_7204 = "-7204";
        public static final String PRINTER_STATUS_ERROR_7205 = "-7205";
        public static final String PRINTER_STATUS_ERROR_7206 = "-7206";
        public static final String PRINTER_STATUS_ERROR_7301 = "-7301";
        public static final String PRINTER_STATUS_ERROR_7302 = "-7302";
        public static final String PRINTER_STATUS_ERROR_7303 = "-7303";
        public static final String PRINTER_STATUS_ERROR_7304 = "-7304";
        public static final String PRINTER_STATUS_ERROR_7305 = "-7305";
        public static final String PRINTER_STATUS_ERROR_7306 = "-7306";
        public static final String PRINTER_STATUS_ERROR_8002 = "-8002";
        public static final String PRINTER_STATUS_ERROR_8004 = "-8004";
        public static final String PRINTER_STATUS_ERROR_8005 = "-8005";
        public static final String PRINTER_STATUS_ERROR_8007 = "-8007";
        public static final String PRINTER_STATUS_ERROR_8201 = "-8201";
        public static final String PRINTER_STATUS_ERROR_8202 = "-8202";

    }
}
