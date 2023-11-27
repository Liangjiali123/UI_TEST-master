package com.example.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

public class fivethActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //开启子线程一
//        MyThread myThread = new MyThread();
//        new Thread(myThread).start();
        //开启子线程二
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();
        dowload();
    }

    private void dowload() {

    }
}
