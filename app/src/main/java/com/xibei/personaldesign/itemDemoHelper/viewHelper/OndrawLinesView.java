package com.xibei.personaldesign.itemDemoHelper.viewHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class OndrawLinesView extends View {
    public OndrawLinesView(Context context) {
        super(context);
    }

    public OndrawLinesView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OndrawLinesView(Context context, AttributeSet attrs, int defStyleAttr) {
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
        float []pts={10,10,20,15,15,20,40,40};
        canvas.drawLines(pts, linePaint);

    }
}
