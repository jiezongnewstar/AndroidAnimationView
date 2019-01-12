package com.xibei.personaldesign.itemDemo;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.xibei.personaldesign.R;
import com.xibei.personaldesign.itemDemoHelper.CharEvaluator;
import com.xibei.personaldesign.itemDemoHelper.CircleView;

public class ActivityAnimation7 extends Activity implements View.OnClickListener {

    TextView textview;

    Button btn_01,btn_02;

    ValueAnimator valueAnimator;

    CircleView circleview;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_7);

        textview = findViewById(R.id.textview);
        circleview = findViewById(R.id.circleview);
        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);


        btn_01.setOnClickListener(this);
        btn_02.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (valueAnimator!=null&&valueAnimator.isRunning()){
           valueAnimator.cancel();
        }
        switch (v.getId()){
            case R.id.btn_01:
                valueAnimator = ValueAnimator.ofObject(new CharEvaluator(),new Character('A'),new Character('Z'));
                valueAnimator.setDuration(1300);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        char text = (char) animation.getAnimatedValue();
                        textview.setText(String.valueOf(text));
                    }
                });

                break;
            case R.id.btn_02:
                circleview.doPointAnim();
                break;
        }
        if (valueAnimator!=null){
            valueAnimator.start();
        }
    }
}
