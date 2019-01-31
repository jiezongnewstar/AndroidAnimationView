package com.xibei.personaldesign.itemDemoHelper.viewHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class OndrawPointsView extends View {
    public OndrawPointsView(Context context) {
        super(context);
    }

    public OndrawPointsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OndrawPointsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pointPaint = new Paint();
        pointPaint.setColor(Color.RED);
        pointPaint.setAntiAlias(true);
        pointPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        pointPaint.setStrokeWidth(5);
        pointPaint.setShadowLayer(100,200,200,Color.BLUE);
        float [] pts = {10,10, 20,20, 30,30};
        canvas.drawPoints(pts,pointPaint);


    }
}
