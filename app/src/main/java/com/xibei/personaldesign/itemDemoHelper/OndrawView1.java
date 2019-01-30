package com.xibei.personaldesign.itemDemoHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class OndrawView1 extends View {
    public OndrawView1(Context context) {
        super(context);
    }

    public OndrawView1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OndrawView1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint cirlePaint = new Paint();
        cirlePaint.setColor(Color.RED);
        cirlePaint.setAntiAlias(true);
        cirlePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        cirlePaint.setShadowLayer(100,200,200,Color.BLUE);
        canvas.drawCircle(200,200,150,cirlePaint);

    }
}
