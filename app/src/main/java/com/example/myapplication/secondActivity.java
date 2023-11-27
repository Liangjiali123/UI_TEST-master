package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {
    private IntentFilter intentFilter;
    private newWorkChangeReceiver newWorkChangeReceiver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");//网络状态发生变化时发出广播
        newWorkChangeReceiver = new newWorkChangeReceiver();
        registerReceiver(newWorkChangeReceiver,intentFilter);//注册广播
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //动态注册的广播需要取消
        unregisterReceiver(newWorkChangeReceiver);
    }

    class newWorkChangeReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            getSystemService(Context.CONNECTIVITY_SERVICE);
            Toast.makeText(context,"newwork Change Receiver",Toast.LENGTH_LONG).show();
        }
    }
}
