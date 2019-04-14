package com.arcsoft.sdk_demo.set;

/**
 * Created by 83541 on 2018/5/27.
 */

public class setdata {
    static public String ip="172.19.125.1";
    static public String Url="http://IP:8080/RFIDWebService/";
    static public String Urls;
    public setdata(){
        Urls=new String();
        Urls=Url.replace("IP",ip);
    }


}
