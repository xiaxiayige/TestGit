package com.example.testgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/***
 * 测试git 提交 冲突 合并
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //新增第一行
        // zhangqilin 分支 新增
        TextView textView=new TextView(this);
        textView.setText("github");
        textView.setText("bbbbb");
        textView.setText("ccccc");
    }
}
