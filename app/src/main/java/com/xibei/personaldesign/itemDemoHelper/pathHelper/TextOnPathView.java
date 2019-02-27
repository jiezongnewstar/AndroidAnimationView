package com.xibei.personaldesign.itemDemoHelper.pathHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class TextOnPathView extends View {
    public TextOnPathView(Context context) {
        super(context);
    }

    public TextOnPathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextOnPathView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.RED);  //设置画笔颜色
        paint.setStyle(Paint.Style.STROKE);//填充样式改为描边
        paint.setStrokeWidth(5);//设置画笔宽度

        //先创建两个大小一样的路径
//第一个逆向生成
        Path CCWRectpath = new Path();
        RectF rect1 =  new RectF(50, 50, 240, 200);
        CCWRectpath.addRect(rect1, Path.Direction.CCW);

//第二个顺向生成
        Path CWRectpath = new Path();
        RectF rect2 =  new RectF(290, 50, 480, 200);
        CWRectpath.addRect(rect2, Path.Direction.CW);

//先画出这两个路径
        canvas.drawPath(CCWRectpath, paint);
        canvas.drawPath(CWRectpath, paint);

//依据路径写出文字
        String text="纸上得来终觉浅，绝知此事要躬行";
        paint.setColor(Color.BLACK);
        paint.setTextSize(40);
        canvas.drawTextOnPath(text, CCWRectpath, 0, 18, paint);//逆时针生成
        canvas.drawTextOnPath(text, CWRectpath, 0, 18, paint);//顺时针生成

    }
}
