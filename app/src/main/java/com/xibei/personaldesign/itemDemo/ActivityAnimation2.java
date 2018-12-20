package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.xibei.personaldesign.R;

public class ActivityAnimation2 extends Activity implements View.OnClickListener {

    Button btn_animation_1, btn_animation_2, btn_animation_3, btn_animation_4, btn_animation_5, btn_animation_6,
            btn_animation_7, btn_animation_8, btn_animation_9;

    View animation2_view;

    Animation animation_1;
    Animation animation_2;
    Animation animation_3;
    Animation animation_4;
    Animation animation_5;
    Animation animation_6;
    Animation animation_7;
    Animation animation_8;
    Animation animation_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_2);
        btn_animation_1 = findViewById(R.id.btn_animation_1);
        btn_animation_2 = findViewById(R.id.btn_animation_2);
        btn_animation_3 = findViewById(R.id.btn_animation_3);
        btn_animation_4 = findViewById(R.id.btn_animation_4);
        btn_animation_5 = findViewById(R.id.btn_animation_5);
        btn_animation_6 = findViewById(R.id.btn_animation_6);
        btn_animation_7 = findViewById(R.id.btn_animation_7);
        btn_animation_8 = findViewById(R.id.btn_animation_8);
        btn_animation_9 = findViewById(R.id.btn_animation_9);
        btn_animation_1.setOnClickListener(this);
        btn_animation_2.setOnClickListener(this);
        btn_animation_3.setOnClickListener(this);
        btn_animation_4.setOnClickListener(this);
        btn_animation_5.setOnClickListener(this);
        btn_animation_6.setOnClickListener(this);
        btn_animation_7.setOnClickListener(this);
        btn_animation_8.setOnClickListener(this);
        btn_animation_9.setOnClickListener(this);
        animation2_view = findViewById(R.id.animation2_view);

        Toast.makeText(this,"这里展示的是rotate的插值器，其他的已经在anim对应的动画里做的注释，效果自行调试",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_animation_1:
                animation_1 = AnimationUtils.loadAnimation(this, R.anim.animation_2_1);
                animation2_view.startAnimation(animation_1);
                break;
            case R.id.btn_animation_2:
                animation_2 = AnimationUtils.loadAnimation(this, R.anim.animation_2_2);
                animation2_view.startAnimation(animation_2);
                break;
            case R.id.btn_animation_3:
                animation_3 = AnimationUtils.loadAnimation(this, R.anim.animation_2_3);
                animation2_view.startAnimation(animation_3);
                break;
            case R.id.btn_animation_4:
                animation_4 = AnimationUtils.loadAnimation(this, R.anim.animation_2_4);
                animation2_view.startAnimation(animation_4);
                break;
            case R.id.btn_animation_5:
                animation_5 = AnimationUtils.loadAnimation(this, R.anim.animation_2_5);
                animation2_view.startAnimation(animation_5);
                break;
            case R.id.btn_animation_6:
                animation_6 = AnimationUtils.loadAnimation(this, R.anim.animation_2_6);
                animation2_view.startAnimation(animation_6);
                break;
            case R.id.btn_animation_7:
                animation_7 = AnimationUtils.loadAnimation(this, R.anim.animation_2_7);
                animation2_view.startAnimation(animation_7);
                break;
            case R.id.btn_animation_8:
                animation_8 = AnimationUtils.loadAnimation(this, R.anim.animation_2_8);
                animation2_view.startAnimation(animation_8);
                break;
            case R.id.btn_animation_9:
                animation_9 = AnimationUtils.loadAnimation(this, R.anim.animation_2_9);
                animation2_view.startAnimation(animation_9);
                break;
        }
    }
}