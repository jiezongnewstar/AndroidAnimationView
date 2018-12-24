package com.xibei.personaldesign.itemDemo;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xibei.personaldesign.R;
import com.xibei.personaldesign.itemDemoHelper.Myinterploator;

public class ActivityAnimation5 extends Activity implements View.OnClickListener {

    Button btn_01,btn_02,btn_03,btn_04;

    View animation5_view;

    Myinterploator myinterploator;

    ValueAnimator valueAnimator = ValueAnimator.ofInt(200,300);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_5);

        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);
        btn_03 = findViewById(R.id.btn_03);
        btn_04 = findViewById(R.id.btn_04);

        animation5_view = findViewById(R.id.animation5_view);

        btn_01.setOnClickListener(this);
        btn_02.setOnClickListener(this);
        btn_03.setOnClickListener(this);
        btn_04.setOnClickListener(this);

        valueAnimator.setDuration(3000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();
                animation5_view.layout(value,value,animation5_view.getWidth()+value,animation5_view.getHeight()+value);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_01:
                myinterploator = new Myinterploator(1);
                break;
            case R.id.btn_02:
                myinterploator = new Myinterploator(2);
                break;
            case R.id.btn_03:
                myinterploator = new Myinterploator(3);
                break;
            case R.id.btn_04:
                myinterploator = new Myinterploator(4);
                break;
        }
        if (valueAnimator.isRunning()){
            valueAnimator.cancel();
        }
        valueAnimator.setInterpolator(myinterploator);
        valueAnimator.start();

    }
}
