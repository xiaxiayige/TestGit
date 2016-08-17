package com.example.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/***
 * 测试git 提交 冲突 合并
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //本地修改MainActiviy 提交到服务器
        //这是我第一次在服务端修改的内容
        //这是我本地修改的内容哦~~~~~~~~~~~
        //我也是第二次在本地修改内容
    }
}
