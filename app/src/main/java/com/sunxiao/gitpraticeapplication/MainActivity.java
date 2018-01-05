package com.sunxiao.gitpraticeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    private ImageButton to_top ;
    private ScrollView scrollView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        //github上添加注释
        Log.e("log","init");
        to_top = (ImageButton) findViewById(R.id.to_top);
        scrollView = (ScrollView) findViewById(R.id.scroll_view);
        to_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
            }
        });
    }
}
