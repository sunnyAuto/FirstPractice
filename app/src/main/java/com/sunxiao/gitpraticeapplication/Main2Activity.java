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
        Log.e("println","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("life","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("life","onDestory");
    }
}
