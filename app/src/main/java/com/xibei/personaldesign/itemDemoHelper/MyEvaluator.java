package com.xibei.personaldesign.itemDemoHelper;

import android.animation.TypeEvaluator;

import java.util.IllegalFormatCodePointException;

public class MyEvaluator implements TypeEvaluator<Integer> {

    private int MODE;

    public MyEvaluator(int MODE) {
        this.MODE = MODE;
    }

    @Override
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int startInt = startValue;
        switch (MODE){
            case 1:
                return (int)(startInt + fraction * (endValue - startInt));
            case 2:
                return (int)(200+startInt + fraction * (endValue - startInt));
            case 3:
                return (int)(endValue - fraction * (endValue - startInt));

        }
        return (int)(startInt - fraction * (endValue - startInt));
    }

}
