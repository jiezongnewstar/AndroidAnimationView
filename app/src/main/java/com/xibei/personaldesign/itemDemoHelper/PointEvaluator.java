package com.xibei.personaldesign.itemDemoHelper;

import android.animation.TypeEvaluator;

public class PointEvaluator implements TypeEvaluator<Point> {

    @Override
    public Point evaluate(float fraction, Point startValue, Point endValue) {
        Point point = new Point((int)(startValue.getRadius() + fraction * (endValue.getRadius() - startValue.getRadius())));
        return point;
    }
}
