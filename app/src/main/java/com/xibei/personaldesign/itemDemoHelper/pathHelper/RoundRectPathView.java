package com.xibei.personaldesign.itemDemoHelper.pathHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RoundRectPathView extends View {
    public RoundRectPathView(Context context) {
        super(context);
    }

    public RoundRectPathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RoundRectPathView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.RED);  //设置画笔颜色
        paint.setStyle(Paint.Style.STROKE);//填充样式改为描边
        paint.setStrokeWidth(5);//设置画笔宽度

        Path path = new Path();
        RectF rect1 =  new RectF(50, 50, 240, 200);
        path.addRoundRect(rect1, 10, 15 , Path.Direction.CCW);

        RectF rect2 =  new RectF(290, 50, 480, 200);
        float radii[] ={10,15,20,25,30,35,40,45};
        path.addRoundRect(rect2, radii, Path.Direction.CCW);

        canvas.drawPath(path, paint);

    }
}
