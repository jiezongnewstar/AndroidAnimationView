package com.xibei.personaldesign.itemDemo;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.xibei.personaldesign.R;
import com.xibei.personaldesign.itemDemoHelper.CharEvaluator;
import com.xibei.personaldesign.itemDemoHelper.MyTextView;

public class ActivityAnimation11 extends Activity implements View.OnClickListener {

    TextView textview;
    ImageView iv_phone;
    ObjectAnimator animator;

    Keyframe k1,k2,k3,k4,k5,k6,k7,k8,k9,k10;
    Keyframe k11,k21,k31,k41,k51,k61,k71,k81,k91,k101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_11);
        textview = findViewById(R.id.textview);
        iv_phone = findViewById(R.id.iv_phone);
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
                setFloatKeyFrame1(0f,20f,-20f,20f,-20f,20f,-20f,20f,-20f,0);
                PropertyValuesHolder keyrotation = PropertyValuesHolder.ofKeyframe("rotation",k1,k2,k3,k4,k5,k6,k7,k8,k9,k10);
                setFloatKeyFrame2(1f,1.1f,1.0f,0.9f,1.1f,0.8f,1.2f,0.9f,1.2f,1f);
                PropertyValuesHolder xScaleKeyFrame = PropertyValuesHolder.ofKeyframe("ScaleX",k11,k21,k31,k41,k51,k61,k71,k81,k91,k101);
                PropertyValuesHolder yScaleKeyFrame = PropertyValuesHolder.ofKeyframe("ScaleY",k11,k21,k31,k41,k51,k61,k71,k81,k91,k101);
                animator = ObjectAnimator.ofPropertyValuesHolder(iv_phone,keyrotation,xScaleKeyFrame,yScaleKeyFrame);
                animator.setDuration(2000);
                animator.start();
                break;
            default:
        }

    }


    private void setFloatKeyFrame1(float f1,float f2,float f3,float f4,float f5,float f6,
                             float f7,float f8,float f9,float f10){
        k1 = Keyframe.ofFloat(0,f1);
        k2 = Keyframe.ofFloat(0.2f,f2);
        k3 = Keyframe.ofFloat(0.3f,f3);
        k4 = Keyframe.ofFloat(0.4f,f4);
        k5 = Keyframe.ofFloat(0.5f,f5);
        k6 = Keyframe.ofFloat(0.6f,f6);
        k7 = Keyframe.ofFloat(0.7f,f7);
        k8 = Keyframe.ofFloat(0.8f,f8);
        k9 = Keyframe.ofFloat(0.9f,f9);
        k10 = Keyframe.ofFloat(1,f10);
    }

    private void setFloatKeyFrame2(float f1,float f2,float f3,float f4,float f5,float f6,
                                  float f7,float f8,float f9,float f10){
        k11 = Keyframe.ofFloat(0,f1);
        k21 = Keyframe.ofFloat(0.2f,f2);
        k31 = Keyframe.ofFloat(0.3f,f3);
        k41 = Keyframe.ofFloat(0.4f,f4);
        k51 = Keyframe.ofFloat(0.5f,f5);
        k61 = Keyframe.ofFloat(0.6f,f6);
        k71 = Keyframe.ofFloat(0.7f,f7);
        k81 = Keyframe.ofFloat(0.8f,f8);
        k91 = Keyframe.ofFloat(0.9f,f9);
        k101 = Keyframe.ofFloat(1,f10);
    }
}
