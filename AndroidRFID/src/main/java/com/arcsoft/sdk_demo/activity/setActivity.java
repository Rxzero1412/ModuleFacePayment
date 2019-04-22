package com.arcsoft.sdk_demo.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.arcsoft.sdk_demo.R;
import com.arcsoft.sdk_demo.set.setdata;

/**
 * Created by 83541 on 2018/5/26.
 */

public class setActivity extends Activity{

    private EditText et_cip;
    private EditText et_lip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_set);
        et_cip= (EditText) findViewById(R.id.et_cip);
        et_lip= (EditText) findViewById(R.id.et_lip);
        et_lip.setText(new setdata().ServerLocalip);
        et_cip.setText(new setdata().ServerCloudip);
        findViewById(R.id.btn_set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new setdata().ServerLocalip = String.valueOf(et_lip.getText());
                new setdata().ServerCloudip = String.valueOf(et_cip.getText());
                new setdata().ServerLocalUrl ="http://"+String.valueOf(et_lip.getText())+":8080/ServerLocal/";
                new setdata().ServerCloudUrl = "http://"+String.valueOf(et_cip.getText())+":8080/ServerCloud/";
                finish();
            }
        });
    }

}
