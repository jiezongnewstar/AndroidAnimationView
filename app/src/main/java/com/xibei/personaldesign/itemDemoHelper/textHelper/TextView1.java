package com.xibei.personaldesign.itemDemoHelper.textHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TextView1 extends View {
    public TextView1(Context context) {
        super(context);
    }

    public TextView1(Context context,AttributeSet attrs) {
        super(context, attrs);
    }

    public TextView1(Context context,AttributeSet attrs, int defStyleAttr) {
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

        //绘图样式，设置为填充
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("填充  西贝", 10,100, paint);

        //绘图样式设置为描边
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawText("描边  西贝", 10,200, paint);

        //绘图样式设置为填充且描边
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawText("填充和描边  西贝", 10,300, paint);

    }
}
