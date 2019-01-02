package com.xibei.personaldesign.itemDemoHelper;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.BounceInterpolator;

public class CircleView extends View {

    private Point mCurPonint;

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mCurPonint!=null){
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(300,300,mCurPonint.getRadius(),paint);
        }
    }

    public void doPointAnim(){
        ValueAnimator animator = ValueAnimator.ofObject(new PointEvaluator(),new Point(10),new Point(300));
        animator.setDuration(1000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                mCurPonint = (Point) animation.getAnimatedValue();
                invalidate();
            }
        });
        animator.setInterpolator(new BounceInterpolator());
        animator.start();
    }
}
