package com.xibei.personaldesign.itemDemoHelper;

public class Point {

    private int radius;

    public Point(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        try {
            return radius;
        } catch (Exception e) {
            return 0;
        }
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
