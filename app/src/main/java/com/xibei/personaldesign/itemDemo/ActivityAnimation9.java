package com.xibei.personaldesign.itemDemo;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.xibei.personaldesign.R;
import com.xibei.personaldesign.itemDemoHelper.SetCircleView;

public class ActivityAnimation9 extends Activity implements View.OnClickListener {

    SetCircleView setCircleView;

    ObjectAnimator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_9);

        setCircleView = findViewById(R.id.setCircleView);
        findViewById(R.id.btn_01).setOnClickListener(this);
        findViewById(R.id.btn_02).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_01:
                    animator = ObjectAnimator.ofInt(setCircleView,"PointRadius",0,300,100);
                    animator.setDuration(2000);
                animator.start();
                break;
            case R.id.btn_02:
                if (animator!=null){
                    animator.cancel();
                }
                break;
            default:
        }

    }
}
