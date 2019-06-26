package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.os.Bundle;

import com.xibei.personaldesign.R;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * //普通设置
 * paint.setStrokeWidth (5);//设置画笔宽度
 * paint.setAntiAlias(true); //指定是否使用抗锯齿功能，如果使用，会使绘图速度变慢
 * paint.setStyle(Paint.Style.FILL);//绘图样式，对于设文字和几何图形都有效
 * paint.setTextAlign(Align.CENTER);//设置文字对齐方式，取值：align.CENTER、align.LEFT或align.RIGHT
 * paint.setTextSize(12);//设置文字大小
 *
 * //样式设置
 * paint.setFakeBoldText(true);//设置是否为粗体文字
 * paint.setUnderlineText(true);//设置下划线
 * paint.setTextSkewX((float) -0.25);//设置字体水平倾斜度，普通斜体字是-0.25
 * paint.setStrikeThruText(true);//设置带有删除线效果
 *
 * //其它设置
 * paint.setTextScaleX(2);//只会将水平方向拉伸，高度不会变
 */

public class ActivityView3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view_3);

        Executor e  = Executors.newCachedThreadPool();

    }







}
