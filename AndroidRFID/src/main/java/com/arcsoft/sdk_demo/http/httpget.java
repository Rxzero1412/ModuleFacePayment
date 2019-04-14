package com.arcsoft.sdk_demo.http;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by 83541 on 2018/6/5.
 */

public class httpget {
    OkHttpClient okHttpClient=new OkHttpClient();//拿到okhttpClient对象

    public httpget(String url){
        Request.Builder builder=new Request.Builder();//构造Request
        final Request request=builder
                .get()
                .url(url)
                .build();
        executeRequest(request);
    }



    private void executeRequest(Request request) {
        Call call=okHttpClient.newCall(request);//将Request封装为Call
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                e.printStackTrace();
            }
            @Override
            public void onResponse(Response response) throws IOException {
            }
        });
    }
}
