package com.xibei.personaldesign.itemDemo;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.xibei.personaldesign.R;
import com.xibei.personaldesign.itemDemoHelper.CharEvaluator;
import com.xibei.personaldesign.itemDemoHelper.MyTextView;

public class ActivityAnimation10 extends Activity implements View.OnClickListener {

    TextView textview;
    MyTextView mytextview;
    ObjectAnimator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_10);
        textview = findViewById(R.id.textview);
        mytextview = findViewById(R.id.mytextview);
        findViewById(R.id.btn_01).setOnClickListener(this);
        findViewById(R.id.btn_02).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_01:
                PropertyValuesHolder rotationHolder = PropertyValuesHolder.ofFloat("Rotation", 60f, 90f, 180f, 20f, -20f, -60f);
                PropertyValuesHolder colorHolder = PropertyValuesHolder.ofInt("BackgroundColor", 0xffffff00, 0x11112200, 0x00992200, 0x55ff2200);
                animator = ObjectAnimator.ofPropertyValuesHolder(textview, rotationHolder, colorHolder);
                animator.setDuration(3000);
                animator.start();
                break;
            case R.id.btn_02:
                PropertyValuesHolder charHolder = PropertyValuesHolder.ofObject("CharText",new CharEvaluator(),new Character('A'),new Character('Z'));
                animator = ObjectAnimator.ofPropertyValuesHolder(mytextview, charHolder);
                animator.setDuration(3000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();
                break;
            default:
        }

    }
}
