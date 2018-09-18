package com.example.administrator.helloliyixin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }
            public void onClick(View view) {
                Intent intent = new Intent();
                switch(view.getId())
                {
                    case R.id.button1:
                        intent.setAction("liyixin.open");
                        intent.addCategory("android.intent.category.DEFAULT");
                        startActivity(intent);
                        break;
                    case R.id.button3:
                        intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bilibili.com"));
                        startActivity(intent);
                        break;
                    case R.id.button2:
                        intent.setClass(MainActivity.this, ClockActivity.class);
                        startActivity(intent);
                        break;
                }
            }
    }


