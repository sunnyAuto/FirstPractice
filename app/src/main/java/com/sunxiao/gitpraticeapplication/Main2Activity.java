package com.sunxiao.gitpraticeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textView ;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.e("aaa","branch更改");
        Log.e("aaa","master新加");
        Log.e("aaa","master新加2");
        Log.e("aaa","master新加3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
