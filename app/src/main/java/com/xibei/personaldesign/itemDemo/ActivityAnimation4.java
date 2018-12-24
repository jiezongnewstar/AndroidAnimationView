package com.xibei.personaldesign.itemDemo;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Toast;
import com.xibei.personaldesign.R;
public class ActivityAnimation4 extends Activity implements View.OnClickListener {

    Button btn_view_anmation, btn_value_animator, btn_repeat, btn_cancle;
    View animation4_view;
    ValueAnimator valueAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_4);
        animation4_view = findViewById(R.id.animation4_view);
        btn_view_anmation = findViewById(R.id.btn_view_anmation);
        btn_value_animator = findViewById(R.id.btn_value_animator);
        btn_cancle = findViewById(R.id.btn_cancle);
        btn_repeat = findViewById(R.id.btn_repeat);
        btn_value_animator.setOnClickListener(this);
        btn_repeat.setOnClickListener(this);
        btn_cancle.setOnClickListener(this);
        btn_view_anmation.setOnClickListener(this);
        animation4_view.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_view_anmation:
                Toast.makeText(ActivityAnimation4.this, "执行完点击黑色方块看看有没有点击效果。", Toast.LENGTH_LONG).show();
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 400f, 0.0f, 400f);
                translateAnimation.setDuration(2000);
                translateAnimation.setFillAfter(true);
                animation4_view.startAnimation(translateAnimation);
                break;
            case R.id.btn_value_animator:
                runAnimator(false);
                Toast.makeText(ActivityAnimation4.this, "执行完点击黑色方块看看有没有点击效果。", Toast.LENGTH_LONG).show();
                break;
            case R.id.animation4_view:
                Toast.makeText(ActivityAnimation4.this, "黑色方块被点击了！", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_cancle:
                if (null != valueAnimator) {
                    valueAnimator.cancel();
                }else {
                    Toast.makeText(ActivityAnimation4.this, "先执行Value Animator！", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_repeat:
                runAnimator(true);
                break;
        }
    }

    private void runAnimator(boolean repeat) {
        valueAnimator = ValueAnimator.ofInt(0, 400, 20, 90, 10, 100);
        valueAnimator.setDuration(1000);
        if (repeat){
            valueAnimator.setRepeatCount(3);
            valueAnimator.setRepeatMode(ValueAnimator.RESTART);
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (int) animation.getAnimatedValue();
                animation4_view.layout(currentValue, currentValue, currentValue + animation4_view.getWidth(),
                        currentValue + animation4_view.getHeight());

            }
        });

        valueAnimator.start();
    }
}
