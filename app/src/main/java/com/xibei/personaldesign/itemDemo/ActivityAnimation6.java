package com.xibei.personaldesign.itemDemo;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xibei.personaldesign.R;
import com.xibei.personaldesign.itemDemoHelper.MyEvaluator;

public class ActivityAnimation6 extends Activity implements View.OnClickListener {

    View animation6_view;

    Button btn_01,btn_02,btn_03,btn_04;

    ValueAnimator valueAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_6);
        animation6_view = findViewById(R.id.animation6_view);
        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);
        btn_03 = findViewById(R.id.btn_03);
        btn_04 = findViewById(R.id.btn_04);
        btn_01.setOnClickListener(this);
        btn_02.setOnClickListener(this);
        btn_03.setOnClickListener(this);
        btn_04.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (valueAnimator!=null&&valueAnimator.isRunning()){
            valueAnimator.cancel();
        }
        switch (v.getId()){
            case R.id.btn_01:
                valueAnimator= ValueAnimator.ofInt(0,400);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int curValue = (int) animation.getAnimatedValue();
                        animation6_view.layout( animation6_view.getLeft(),curValue,
                                animation6_view.getRight(),animation6_view.getHeight()+curValue);
                    }
                });
                valueAnimator.setDuration(1000);
                valueAnimator.setEvaluator(new MyEvaluator(1));
                break;
            case R.id.btn_02:
                valueAnimator= ValueAnimator.ofInt(0,400);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int curValue = (int) animation.getAnimatedValue();
                        animation6_view.layout( animation6_view.getLeft(),curValue,
                                animation6_view.getRight(),animation6_view.getHeight()+curValue);
                    }
                });
                valueAnimator.setDuration(1000);
                valueAnimator.setEvaluator(new MyEvaluator(2));
                break;
            case R.id.btn_03:
                valueAnimator= ValueAnimator.ofInt(0,400);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int curValue = (int) animation.getAnimatedValue();
                        animation6_view.layout( animation6_view.getLeft(),curValue,
                                animation6_view.getRight(),animation6_view.getHeight()+curValue);
                    }
                });
                valueAnimator.setDuration(1000);
                valueAnimator.setEvaluator(new MyEvaluator(3));
                break;
            case R.id.btn_04:
                valueAnimator = ValueAnimator.ofInt(0xffffff00,0xff0000ff);
                valueAnimator.setEvaluator(new ArgbEvaluator());
                valueAnimator.setDuration(3000);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int curValue = (int)animation.getAnimatedValue();
                        animation6_view.setBackgroundColor(curValue);

                    }
                });

                break;
        }
        valueAnimator.start();
    }
}
