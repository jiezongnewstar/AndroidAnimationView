package com.xibei.personaldesign.itemDemoHelper.pathHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ArcPathView extends View {
    public ArcPathView(Context context) {
        super(context);
    }

    public ArcPathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ArcPathView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.RED);  //设置画笔颜色
        paint.setStyle(Paint.Style.STROKE);//填充样式改为描边
        paint.setStrokeWidth(5);//设置画笔宽度
        paint.setColor(Color.RED);  //设置画笔颜色

        Path path = new Path();
        RectF rect =  new RectF(50, 50, 240, 200);
        path.addArc(rect, 0, 100);

        canvas.drawPath(path, paint);//画出路径

    }
}
