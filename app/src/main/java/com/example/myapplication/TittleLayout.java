package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class TittleLayout extends LinearLayout {
    public TittleLayout(Context context) {
        super(context);
    }

    public TittleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //动态加载标题栏
        LayoutInflater.from(context).inflate(R.layout.title,this);
    }

    public TittleLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
