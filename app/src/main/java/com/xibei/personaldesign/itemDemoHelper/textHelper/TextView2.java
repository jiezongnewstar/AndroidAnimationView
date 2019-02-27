package com.xibei.personaldesign.itemDemoHelper.textHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TextView2 extends View {
    public TextView2(Context context) {
        super(context);
    }

    public TextView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextView2(Context context, AttributeSet attrs, int defStyleAttr) {
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

//样式设置
        paint.setFakeBoldText(true);//设置是否为粗体文字
        paint.setUnderlineText(true);//设置下划线
        paint.setStrikeThruText(true);//设置带有删除线效果

//设置字体水平倾斜度，普通斜体字是-0.25，可见往右斜
        paint.setTextSkewX((float) -0.25);
        canvas.drawText("斜度 -0.25", 10,100, paint);

//水平倾斜度设置为：0.25，往左斜
        paint.setTextSkewX((float) 0.25);
        canvas.drawText("斜度0.25", 10,200, paint);


    }
}
