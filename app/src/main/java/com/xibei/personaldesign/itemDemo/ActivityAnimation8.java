package com.xibei.personaldesign.itemDemo;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xibei.personaldesign.R;

public class ActivityAnimation8 extends Activity implements View.OnClickListener {

    TextView textview;

    ObjectAnimator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_item_animation_8);

        textview = findViewById(R.id.textview);

        findViewById(R.id.btn_01).setOnClickListener(this);
        findViewById(R.id.btn_02).setOnClickListener(this);
        findViewById(R.id.btn_03).setOnClickListener(this);
        findViewById(R.id.btn_04).setOnClickListener(this);
        findViewById(R.id.btn_05).setOnClickListener(this);
        findViewById(R.id.btn_06).setOnClickListener(this);
        findViewById(R.id.btn_07).setOnClickListener(this);
        findViewById(R.id.btn_08).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (animator!=null){
            if (animator.isRunning()){
                animator.cancel();
            }
        }
        switch (v.getId()){
            case R.id.btn_01:
                animator = ObjectAnimator.ofFloat(textview,"alpha",1,0,1);
                break;
            case R.id.btn_02:
                animator = ObjectAnimator.ofFloat(textview,"rotation",0,180,0);
                break;
            case R.id.btn_03:
                animator = ObjectAnimator.ofFloat(textview,"rotationX",0,270,0);
                break;
            case R.id.btn_04:
                animator = ObjectAnimator.ofFloat(textview,"rotationY",0,180,0);
                break;
            case R.id.btn_05:
                animator = ObjectAnimator.ofFloat(textview, "translationX", 0, 200, -200,0);
                break;
            case R.id.btn_06:
                animator = ObjectAnimator.ofFloat(textview, "translationY", 0, 200, -100,0);
                break;
            case R.id.btn_07:
                animator = ObjectAnimator.ofFloat(textview, "scaleX", 0, 3, 1);
                break;
            case R.id.btn_08:
                animator = ObjectAnimator.ofFloat(textview, "scaleY", 0, 3, 1);
                break;
                default:
        }
        animator.setDuration(2000);
        animator.start();
    }
}
