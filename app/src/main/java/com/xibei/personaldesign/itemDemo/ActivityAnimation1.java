package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.xibei.personaldesign.R;

public class ActivityAnimation1 extends Activity implements View.OnClickListener {

    Button btn_animation_1, btn_animation_2, btn_animation_3, btn_animation_4, btn_animation_5, btn_animation_6,
            btn_animation_7, btn_animation_8, btn_animation_9, btn_animation_10;

    View animation1_view;

    Animation animation_1;
    Animation animation_2;
    Animation animation_3;
    Animation animation_4;
    Animation animation_5;
    Animation animation_6;
    Animation animation_7;
    Animation animation_8;
    Animation animation_9;
    Animation animation_10;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        Transition slide = TransitionInflater.from(this).inflateTransition(R.transition.slide);
        setContentView(R.layout.activity_item_animation_1);
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
        getWindow().setEnterTransition(slide);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_animation_1:
                animation_1 = AnimationUtils.loadAnimation(this, R.anim.animation_1_1);
                animation1_view.startAnimation(animation_1);
                break;
            case R.id.btn_animation_2:
                animation_2 = AnimationUtils.loadAnimation(this, R.anim.animation_1_2);
                animation1_view.startAnimation(animation_2);
                break;
            case R.id.btn_animation_3:
                animation_3 = AnimationUtils.loadAnimation(this, R.anim.animation_1_3);
                animation1_view.startAnimation(animation_3);
                break;
            case R.id.btn_animation_4:
                animation_4 = AnimationUtils.loadAnimation(this, R.anim.animation_1_4);
                animation1_view.startAnimation(animation_4);
                break;
            case R.id.btn_animation_5:
                animation_5 = AnimationUtils.loadAnimation(this, R.anim.animation_1_5);
                animation1_view.startAnimation(animation_5);
                break;
            case R.id.btn_animation_6:
                animation_6 = AnimationUtils.loadAnimation(this, R.anim.animation_1_6);
                animation1_view.startAnimation(animation_6);
                break;
            case R.id.btn_animation_7:
                animation_7 = AnimationUtils.loadAnimation(this, R.anim.animation_1_7);
                animation1_view.startAnimation(animation_7);
                break;
            case R.id.btn_animation_8:
                animation_8 = AnimationUtils.loadAnimation(this, R.anim.animation_1_8);
                animation1_view.startAnimation(animation_8);
                break;
            case R.id.btn_animation_9:
                animation_9 = AnimationUtils.loadAnimation(this, R.anim.animation_1_9);
                animation1_view.startAnimation(animation_9);
                break;
                case R.id.btn_animation_10:
                animation_10 = AnimationUtils.loadAnimation(this, R.anim.animation_1_10);
                animation1_view.startAnimation(animation_10);
                break;
        }
    }
}
