package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button first,second;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initi();
    }

    private void initi() {
        first = findViewById(R.id.first);
        first.setOnClickListener(this);
        second = findViewById(R.id.second);
        second.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.first:
                //UI
                Log.i("MainActivityTest :","first was clicked");
                Intent intent1 = new Intent(MainActivity.this,firstActivity.class);
                startActivity(intent1);
                break;
            case R.id.second:
                //广播
                Log.i("MainActivityTest :","second was clicked");
                // AlertDialog.Builder builder = new AlertDialog.Builder(this);
                Intent intent2 = new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent2);
                break;
            case R.id.third:
                //数据存储
                Log.i("MainActivityTest :","third was clicked");
                Intent intent3 = new Intent(MainActivity.this,thirdActivity.class);
                startActivity(intent3);
                break;
            case R.id.threeth:
                //网络技术
                Log.i("MainActivityTest :","threeth was clicked");
                Intent intent4 = new Intent(MainActivity.this, forthActivity.class);
                startActivity(intent4);
                break;
            case R.id.floatButton:
                //服务
                Log.i("MainActivityTest :","floatButton was clicked");
                Intent intent5 = new Intent(MainActivity.this, fivethActivity.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}