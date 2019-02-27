package com.xibei.personaldesign.itemDemoHelper.textHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TextView4 extends View {
    public TextView4(Context context) {
        super(context);
    }

    public TextView4(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextView4(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.RED);  //设置画笔颜色

        paint.setStrokeWidth (5);//设置画笔宽度
        paint.setAntiAlias(true); //指定是否使用抗锯齿功能，如果使用，会使绘图速度变慢
        paint.setTextSize(80);//设置文字大小
        paint.setStyle(Paint.Style.FILL);//绘图样式，设置为填充

        float []pos=new float[]{80,100, 80,200,};
        canvas.drawPosText("西贝", pos, paint);//两个构造函数

    }
}
