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

public class homeActivity extends Activity{
    private static final int REQUEST_CODE_OP = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_home);
        findViewById(R.id.btn_run).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(homeActivity.this)
                        .setTitle("请选择相机")
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .setItems(new String[]{"后置相机", "前置相机"}, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startDetector(which);
                            }
                        })
                        .show();
            }
        });
        findViewById(R.id.btn_set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homeActivity.this, setActivity.class));
            }
        });
    }
    private void startDetector(int camera) {
        Intent it = new Intent(homeActivity.this, DetecterActivity.class);
        it.putExtra("Camera", camera);
        startActivityForResult(it, REQUEST_CODE_OP);
    }
}
