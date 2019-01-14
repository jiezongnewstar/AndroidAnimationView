package com.xibei.personaldesign.itemDemoHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SetCircleView extends View {

    private Point mPoint = new Point(100);

    public SetCircleView(Context context) {
        super(context);
    }

    public SetCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SetCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        if (mPoint!=null){
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(300,300,mPoint.getRadius(),paint);
        }
        super.onDraw(canvas);
    }

    void setPointRadius(int radius){
        mPoint.setRadius(radius);
        invalidate();
    }
}
