package com.xibei.personaldesign.itemDemoHelper.viewHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class OndrawPointView extends View {
    public OndrawPointView(Context context) {
        super(context);
    }

    public OndrawPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OndrawPointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pointPaint = new Paint();
        pointPaint.setColor(Color.RED);
        pointPaint.setAntiAlias(true);
        pointPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        pointPaint.setStrokeWidth(50);
        pointPaint.setShadowLayer(100,200,200,Color.BLUE);
        canvas.drawPoint(50,50,pointPaint);

    }
}
