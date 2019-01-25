package com.xibei.personaldesign.itemDemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.xibei.personaldesign.R;

public class ActivityAnimation13 extends Activity implements View.OnClickListener {

    ImageView iv_main, iv_circle1, iv_circle2, iv_circle3, iv_circle4, iv_circle5;

    boolean open = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_13);
        iv_main = findViewById(R.id.iv_main);
        iv_circle2 = findViewById(R.id.iv_circle2);
        iv_circle3 = findViewById(R.id.iv_circle3);
        iv_circle4 = findViewById(R.id.iv_circle4);
        iv_circle5 = findViewById(R.id.iv_circle5);
        iv_circle1 = findViewById(R.id.iv_circle1);

        iv_main.setOnClickListener(this);
        iv_circle1.setOnClickListener(this);
        iv_circle2.setOnClickListener(this);
        iv_circle3.setOnClickListener(this);
        iv_circle4.setOnClickListener(this);
        iv_circle5.setOnClickListener(this);

        iv_circle1.setEnabled(false);
        iv_circle2.setEnabled(false);
        iv_circle3.setEnabled(false);
        iv_circle4.setEnabled(false);
        iv_circle5.setEnabled(false);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_main:
                doAnimator();
                if (!open) {
                    open = true;
                    iv_circle1.setEnabled(true);
                    iv_circle2.setEnabled(true);
                    iv_circle3.setEnabled(true);
                    iv_circle4.setEnabled(true);
                    iv_circle5.setEnabled(true);
                } else {
                    open = false;
                    iv_circle1.setEnabled(false);
                    iv_circle2.setEnabled(false);
                    iv_circle3.setEnabled(false);
                    iv_circle4.setEnabled(false);
                    iv_circle5.setEnabled(false);
                }
                break;
            case R.id.iv_circle1:
                Toast.makeText(ActivityAnimation13.this, "第1个被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_circle2:
                Toast.makeText(ActivityAnimation13.this, "第2个被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_circle3:
                Toast.makeText(ActivityAnimation13.this, "第3个被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_circle4:
                Toast.makeText(ActivityAnimation13.this, "第4个被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_circle5:
                Toast.makeText(ActivityAnimation13.this, "第5个被点击了", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //展开动画
    private void doAnimator() {
        AnimatorSet set = new AnimatorSet();
        set.playTogether(
                alpha(iv_circle1),
                alpha(iv_circle2),
                alpha(iv_circle3),
                alpha(iv_circle4),
                alpha(iv_circle5),
                scaleXAnimator(iv_circle1),
                scaleXAnimator(iv_circle2),
                scaleXAnimator(iv_circle3),
                scaleXAnimator(iv_circle4),
                scaleXAnimator(iv_circle5),
                scaleYAnimator(iv_circle1),
                scaleYAnimator(iv_circle2),
                scaleYAnimator(iv_circle3),
                scaleYAnimator(iv_circle4),
                scaleYAnimator(iv_circle5),
                tranlsationX(iv_circle1, -600),
                tranlsationX(iv_circle2, -500),
                tranlsationX(iv_circle3, -360),
                tranlsationX(iv_circle4, -200),
                tranlsationX(iv_circle5, -0),
                tranlsationY(iv_circle1, -0),
                tranlsationY(iv_circle2, -200),
                tranlsationY(iv_circle3, -360),
                tranlsationY(iv_circle4, -500),
                tranlsationY(iv_circle5, -600));

        set.setDuration(500);
        set.start();

    }



    //X平移动画
    private ObjectAnimator tranlsationX(View view, float x) {
        if (!open) {
            return ObjectAnimator.ofFloat(view, "TranslationX", 0f, x);
        } else {
            return ObjectAnimator.ofFloat(view, "TranslationX", x,0f);
        }
    }

    //Y平移动画
    private ObjectAnimator tranlsationY(View view, float y) {
        if (!open) {
            return ObjectAnimator.ofFloat(view, "TranslationY", 0f, y);
        } else {
            return ObjectAnimator.ofFloat(view, "TranslationY", y,0f);
        }
    }

    //透明动画
    private ObjectAnimator alpha(View view) {
        if (!open) {
            return ObjectAnimator.ofFloat(view, "alpha", 0f, 0.4f, 0.8f, 1f);
        } else {
            return ObjectAnimator.ofFloat(view, "alpha", 1f, 0.8f, 0.4f, 0f);
        }
    }

    //X放大缩小动画
    private ObjectAnimator scaleXAnimator(View view) {
        if (!open) {
            return ObjectAnimator.ofFloat(view, "ScaleX", 0.3f, 0.5f, 0.8f, 1f);
        } else {
            return ObjectAnimator.ofFloat(view, "ScaleX", 1f, 0.8f, 0.5f, 0.3f);
        }
    }

    //Y放大缩小动画
    private ObjectAnimator scaleYAnimator(View view) {
        if (!open) {
            return ObjectAnimator.ofFloat(view, "ScaleY", 0.3f, 0.5f, 0.8f, 1f);
        } else {
            return ObjectAnimator.ofFloat(view, "ScaleY", 1f, 0.8f, 0.5f, 0.3f);
        }
    }
}
