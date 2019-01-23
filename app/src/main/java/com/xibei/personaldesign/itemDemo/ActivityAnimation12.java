package com.xibei.personaldesign.itemDemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.xibei.personaldesign.R;

public class ActivityAnimation12 extends Activity implements View.OnClickListener {

    TextView textView1, textView2;
    Button btn_01, btn_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_12);
        textView1 = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);
        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);

        btn_01.setOnClickListener(this);
        btn_02.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_01) {
            doAnimator(false);
        } else {
            doAnimator(true);
        }
    }

    private void doAnimator(boolean together) {
        ObjectAnimator tv1BgAnimator = ObjectAnimator.ofInt(textView1, "BackgroundColor", 0xff112233, 0xff223344, 0xff334455);
        ObjectAnimator tv1Translate = ObjectAnimator.ofFloat(textView1, "translationY", 0, 10, 20, 30, 40, 50, 0);
        ObjectAnimator tv1ScaleX = ObjectAnimator.ofFloat(textView1, "scaleX", 1f, 1.1f, 1.2f, 1.1f, 1f);

        ObjectAnimator tv2BgAnimator = ObjectAnimator.ofInt(textView2, "BackgroundColor", 0xff112233, 0xff223344, 0xff334455);
        ObjectAnimator tv2Translate = ObjectAnimator.ofFloat(textView2, "translationY", 0, 10, 20, 30, 40, 50, 0);
        ObjectAnimator tv2ScaleX = ObjectAnimator.ofFloat(textView2, "scaleX", 1f, 1.1f, 1.2f, 1.1f, 1f);

        AnimatorSet animatorSet = new AnimatorSet();
        if (together){
            animatorSet.playTogether(tv1BgAnimator,tv1Translate,tv1ScaleX,tv2BgAnimator,tv2Translate,tv2ScaleX);
        }else {
            animatorSet.playSequentially(tv1BgAnimator,tv1Translate,tv1ScaleX,tv2BgAnimator,tv2Translate,tv2ScaleX);
        }

        animatorSet.setDuration(2000);
        animatorSet.start();

    }


}
