package com.xibei.personaldesign.itemDemoHelper;

import android.animation.TimeInterpolator;

public class Myinterploator implements TimeInterpolator {

    private int method;

    public Myinterploator(int method) {
        this.method = method;
    }

    @Override
    public float getInterpolation(float input) {
        switch (method){
            case 1:
                return input;
            case 2:
                return 1-input;
            case 3:
                return 2 - input;
            case 4:
                return  input - 1;
        }
        return 0;
    }
}
