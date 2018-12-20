package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Toast;

import com.xibei.personaldesign.R;

public class ActivityAnimation3 extends Activity implements View.OnClickListener {
    Button btn_animation_1, btn_animation_2, btn_animation_3, btn_animation_4, btn_animation_5, btn_animation_6,
            btn_animation_7, btn_animation_8, btn_animation_9, btn_animation_10;
    View animation1_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_1);
        Toast.makeText(this,"这里对应动画一内容，实现方式为代码实现方式",Toast.LENGTH_SHORT).show();
        btn_animation_1 = findViewById(R.id.btn_animation_1);
        btn_animation_2 = findViewById(R.id.btn_animation_2);
        btn_animation_3 = findViewById(R.id.btn_animation_3);
        btn_animation_4 = findViewById(R.id.btn_animation_4);
        btn_animation_5 = findViewById(R.id.btn_animation_5);
        btn_animation_6 = findViewById(R.id.btn_animation_6);
        btn_animation_7 = findViewById(R.id.btn_animation_7);
        btn_animation_8 = findViewById(R.id.btn_animation_8);
        btn_animation_9 = findViewById(R.id.btn_animation_9);
        btn_animation_10 = findViewById(R.id.btn_animation_10);
        btn_animation_1.setOnClickListener(this);
        btn_animation_2.setOnClickListener(this);
        btn_animation_3.setOnClickListener(this);
        btn_animation_4.setOnClickListener(this);
        btn_animation_5.setOnClickListener(this);
        btn_animation_6.setOnClickListener(this);
        btn_animation_7.setOnClickListener(this);
        btn_animation_8.setOnClickListener(this);
        btn_animation_9.setOnClickListener(this);
        btn_animation_10.setOnClickListener(this);
        animation1_view = findViewById(R.id.animation1_view);
    }

    @Override
    public void onClick(View v) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f,1.4f,0.0f,1.4f,50,50);
        scaleAnimation.setDuration(700);
        switch (v.getId()) {
            case R.id.btn_animation_1:
                animation1_view.startAnimation(scaleAnimation);
                break;
            case R.id.btn_animation_2:
                animation1_view.startAnimation(scaleAnimation);
                break;
            case R.id.btn_animation_3:
                scaleAnimation.setFillAfter(true);
                animation1_view.startAnimation(scaleAnimation);
                break;
            case R.id.btn_animation_4:
                scaleAnimation.setFillBefore(true);
                animation1_view.startAnimation(scaleAnimation);
                break;
            case R.id.btn_animation_5:
                scaleAnimation.setFillBefore(true);
                scaleAnimation.setRepeatCount(3);
                scaleAnimation.setRepeatMode(Animation.RESTART);
                animation1_view.startAnimation(scaleAnimation);
                break;
            case R.id.btn_animation_6:
                scaleAnimation.setFillBefore(true);
                scaleAnimation.setRepeatCount(3);
                scaleAnimation.setRepeatMode(Animation.REVERSE);
                animation1_view.startAnimation(scaleAnimation);
                break;
            case R.id.btn_animation_7:
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f,0.1f);
                alphaAnimation.setDuration(3000);
                alphaAnimation.setFillBefore(true);
                animation1_view.startAnimation(alphaAnimation);
                break;
            case R.id.btn_animation_8:
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f,-650f,50,50);
                rotateAnimation.setDuration(3000);
                rotateAnimation.setFillAfter(true);
                animation1_view.startAnimation(rotateAnimation);
                break;
            case R.id.btn_animation_9:
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f,-80f,0.0f,-80f);
                translateAnimation.setDuration(2000);
                translateAnimation.setFillBefore(true);
                animation1_view.startAnimation(translateAnimation);
                break;
            case R.id.btn_animation_10:
                AlphaAnimation alphaAnimation1 = new AlphaAnimation(1.0f,0.1f);
                alphaAnimation1.setDuration(3000);
                alphaAnimation1.setFillBefore(true);
                RotateAnimation rotateAnimation1 = new RotateAnimation(0.0f,-650f,50,50);
                rotateAnimation1.setDuration(3000);
                rotateAnimation1.setFillAfter(true);
                TranslateAnimation translateAnimation1 = new TranslateAnimation(0.0f,-80f,0.0f,-80f);
                translateAnimation1.setDuration(2000);
                translateAnimation1.setFillBefore(true);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation1);
                animationSet.addAnimation(rotateAnimation1);
                animationSet.addAnimation(translateAnimation1);
                animation1_view.startAnimation(animationSet);
                break;
        }
    }
}
