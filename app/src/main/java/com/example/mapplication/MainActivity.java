package com.example.mapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //生命控件
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到空间
        mBtnLogin = findViewById(R.id.btn_1);

        //实现跳转
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = null;
                intent = new Intent(MainActivity.this,FountionActivity.class);
                startActivity(intent);
            }
        });
    }
}