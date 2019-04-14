package com.arcsoft.sdk_demo.AlertDialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;

/**
 * Created by 83541 on 2018/6/3.
 */

public class AlertDialogs {

    private static final String TAG="RFID";
    private static boolean debug=true;

    public static void e(String msg){
        if(debug)
            Log.e(TAG,msg);
    }
    public static void dialog(String msg,View view){
        Context context=view.getContext();
        // import android.support.v7.app.AlertDialogs;
        new AlertDialog.Builder(context)
                .setTitle("")
                .setMessage(msg)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .create().show();
    }


}
