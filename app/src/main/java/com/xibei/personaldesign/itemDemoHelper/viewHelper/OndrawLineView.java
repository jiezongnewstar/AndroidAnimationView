package com.xibei.personaldesign.itemDemoHelper.viewHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class OndrawLineView extends View {
    public OndrawLineView(Context context) {
        super(context);
    }

    public OndrawLineView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OndrawLineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint linePaint = new Paint();
        linePaint.setColor(Color.RED);
        linePaint.setAntiAlias(true);
        linePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        linePaint.setStrokeWidth(5);
        linePaint.setShadowLayer(100,200,200,Color.BLUE);
        canvas.drawLine(0,0,100,100,linePaint);

    }
}
