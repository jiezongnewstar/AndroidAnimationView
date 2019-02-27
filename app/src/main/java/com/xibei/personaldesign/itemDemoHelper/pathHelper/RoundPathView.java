package com.xibei.personaldesign.itemDemoHelper.pathHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class RoundPathView extends View {
    public RoundPathView(Context context) {
        super(context);
    }

    public RoundPathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RoundPathView(Context context,  AttributeSet attrs, int defStyleAttr) {
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
        path.addCircle(200, 200, 100, Path.Direction.CCW);
        canvas.drawPath(path, paint);

    }
}
