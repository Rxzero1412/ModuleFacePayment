package com.arcsoft.sdk_demo.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.arcsoft.sdk_demo.R;

/**
 * Created by 83541 on 2018/5/26.
 */

public class setActivity extends Activity{
    private static final int REQUEST_CODE_OP = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_set);

    }

}
