package com.xibei.personaldesign.itemDemoHelper.textHelper;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import com.xibei.personaldesign.MyApplication;

public class TextView6 extends View {

    public TextView6(Context context) {
        super(context);
    }

    public TextView6(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextView6(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /**
         *
         * 传统字体
         *
          //使用系统自带字体绘制
         Paint paint=new Paint();
        paint.setColor(Color.RED);  //设置画笔颜色

        paint.setStrokeWidth (5);//设置画笔宽度
        paint.setAntiAlias(true); //指定是否使用抗锯齿功能，如果使用，会使绘图速度变慢
        paint.setTextSize(60);//设置文字大小
        paint.setStyle(Paint.Style.STROKE);//绘图样式，设置为填充

        String familyName = "宋体";
        Typeface font = Typeface.create(familyName,Typeface.NORMAL);
        paint.setTypeface(font);
        canvas.drawText("欢迎光临Harvic的博客",10,100, paint);
       */

        //自定义字体，，，迷你简罗卜
        Paint paint=new Paint();
        paint.setColor(Color.RED);  //设置画笔颜色

        paint.setStrokeWidth (5);//设置画笔宽度
        paint.setAntiAlias(true); //指定是否使用抗锯齿功能，如果使用，会使绘图速度变慢
        paint.setTextSize(60);//设置文字大小
        paint.setStyle(Paint.Style.FILL);//绘图样式，设置为填充

        AssetManager mgr= MyApplication.mContext.getAssets();//得到AssetManager
        Typeface typeface=Typeface.createFromAsset(mgr, "Anna.ttf");//根据路径得到Typeface
        paint.setTypeface(typeface);
        canvas.drawText("西贝",10,100, paint);//两个构造函数


    }
}
