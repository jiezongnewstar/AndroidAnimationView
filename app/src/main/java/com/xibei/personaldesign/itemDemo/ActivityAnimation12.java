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

    Button btn_01, btn_02,btn_03,
            btn_04,btn_05,btn_06,
            btn_07,btn_08,btn_09,
            btn_10,btn_11,btn_12,
            btn_13,btn_14,btn_15,btn_16;

    ObjectAnimator tv1BgAnimator,tv1Translate,tv1ScaleX,
            tv2BgAnimator,tv2Translate,tv2ScaleX;

    final int TV1_BG =1;
    final int TV1_BG_SCLAEX =2;
    final int TV1_BG_SCLAEX_TRANSLATIONY =3;
    final int TV2_BG =4;
    final int TV2_BG_SCLAEX =5;
    final int TV2_BG_SCLAEX_TRANSLATIONY =6;
    final int _TV1_TV2 =7;
    final int _TV2__TV1 =8;
    final int TV1__TV2 =9;
    final int _TV1_BG_SCLAEX_TRANSLATIONY =10;
    final int _TV1_TRANSLATIONY_SCLAEX_BG =11;
    final int _TV2_BG_SCLAEX_TRANSLATIONY =12;
    final int _TV2_TRANSLATIONY_SCLAEX_BG =13;
    final int _TV1_TRANSLATIONY_SCLAEX_BG_TV2_TRANSLATIONY_SCLAEX_BG =14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_12);
        textView1 = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);
        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);
        btn_03 = findViewById(R.id.btn_03);
        btn_04 = findViewById(R.id.btn_04);
        btn_05 = findViewById(R.id.btn_05);
        btn_06 = findViewById(R.id.btn_06);
        btn_07 = findViewById(R.id.btn_07);
        btn_08 = findViewById(R.id.btn_08);
        btn_09 = findViewById(R.id.btn_09);
        btn_10 = findViewById(R.id.btn_10);
        btn_11 = findViewById(R.id.btn_11);
        btn_11 = findViewById(R.id.btn_11);
        btn_12 = findViewById(R.id.btn_12);
        btn_13 = findViewById(R.id.btn_13);
        btn_14 = findViewById(R.id.btn_14);
        btn_15 = findViewById(R.id.btn_15);
        btn_16 = findViewById(R.id.btn_16);

        btn_01.setOnClickListener(this);
        btn_02.setOnClickListener(this);
        btn_03.setOnClickListener(this);
        btn_04.setOnClickListener(this);
        btn_05.setOnClickListener(this);
        btn_06.setOnClickListener(this);
        btn_07.setOnClickListener(this);
        btn_08.setOnClickListener(this);
        btn_09.setOnClickListener(this);
        btn_10.setOnClickListener(this);
        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);
        btn_14.setOnClickListener(this);
        btn_15.setOnClickListener(this);
        btn_16.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        initAnimator();

        switch (v.getId()){
            case R.id.btn_01:
                doAnimator(false);
                break;
            case R.id.btn_02:
                doAnimator(true);
                break;
            case R.id.btn_03:
                animatorSetBuilder(TV1_BG);
                break;
            case R.id.btn_04:
                animatorSetBuilder(TV1_BG_SCLAEX);
                break;
            case R.id.btn_05:
                animatorSetBuilder(TV1_BG_SCLAEX_TRANSLATIONY);
                break;
            case R.id.btn_06:
                animatorSetBuilder(TV2_BG);
                break;
            case R.id.btn_07:
                animatorSetBuilder(TV2_BG_SCLAEX);
                break;
            case R.id.btn_08:
                animatorSetBuilder(TV2_BG_SCLAEX_TRANSLATIONY);
                break;
            case R.id.btn_09:
                animatorSetBuilder(_TV1_TV2);
                break;
            case R.id.btn_10:
                animatorSetBuilder(_TV2__TV1);
                break;
            case R.id.btn_11:
                animatorSetBuilder(TV1__TV2);
                break;
            case R.id.btn_12:
                animatorSetBuilder(_TV1_BG_SCLAEX_TRANSLATIONY);
                break;
            case R.id.btn_13:
                animatorSetBuilder(_TV1_TRANSLATIONY_SCLAEX_BG);
                break;
            case R.id.btn_14:
                animatorSetBuilder(_TV2_BG_SCLAEX_TRANSLATIONY);
                break;
            case R.id.btn_15:
                animatorSetBuilder(_TV2_TRANSLATIONY_SCLAEX_BG);
                break;
            case R.id.btn_16:
                animatorSetBuilder(_TV1_TRANSLATIONY_SCLAEX_BG_TV2_TRANSLATIONY_SCLAEX_BG);
                break;

        }
    }

    private void initAnimator() {
        tv1BgAnimator = ObjectAnimator.ofInt(textView1, "BackgroundColor", 0xff112233, 0xff223344, 0xff334455);
        tv1Translate = ObjectAnimator.ofFloat(textView1, "translationY", 0, 10, 20, 30, 40, 50, 0);
        tv1ScaleX = ObjectAnimator.ofFloat(textView1, "scaleX", 1f, 1.1f, 1.2f, 1.1f, 1f);

        tv2BgAnimator = ObjectAnimator.ofInt(textView2, "BackgroundColor", 0xff112233, 0xff223344, 0xff334455);
        tv2Translate = ObjectAnimator.ofFloat(textView2, "translationY", 0, 10, 20, 30, 40, 50, 0);
        tv2ScaleX = ObjectAnimator.ofFloat(textView2, "scaleX", 1f, 1.1f, 1.2f, 1.1f, 1f);
    }

    private void doAnimator(boolean together){
        AnimatorSet animatorSet = new AnimatorSet();
        if (together){
            animatorSet.playTogether(tv1BgAnimator,tv1Translate,tv1ScaleX,
                    tv2BgAnimator,tv2Translate,tv2ScaleX);
        }else {
            animatorSet.playSequentially(tv1BgAnimator,tv1Translate,tv1ScaleX,
                    tv2BgAnimator,tv2Translate,tv2ScaleX);
        }
        animatorSet.setDuration(2000);
        animatorSet.start();
    }


    private void animatorSetBuilder(int animNo){
        AnimatorSet animatorSet = new AnimatorSet();
        switch (animNo){
            case TV1_BG:
                AnimatorSet.Builder builder = animatorSet.play(tv1BgAnimator);
                break;
            case TV1_BG_SCLAEX:
                AnimatorSet.Builder builder1 = animatorSet
                        .play(tv1BgAnimator)
                        .with(tv1ScaleX);
                break;
            case TV1_BG_SCLAEX_TRANSLATIONY:
                AnimatorSet.Builder builder2 = animatorSet
                        .play(tv1BgAnimator)
                        .with(tv1ScaleX)
                        .with(tv1Translate);
                break;
            case TV2_BG:
                AnimatorSet.Builder builder3 = animatorSet.play(tv2BgAnimator);
                break;
            case TV2_BG_SCLAEX:
                AnimatorSet.Builder builder4 = animatorSet
                        .play(tv2BgAnimator)
                        .with(tv2ScaleX);
                break;
            case TV2_BG_SCLAEX_TRANSLATIONY:
                AnimatorSet.Builder builder5 = animatorSet
                        .play(tv2BgAnimator)
                        .with(tv2ScaleX)
                        .with(tv2Translate);
                break;
            case _TV1_TV2:
                AnimatorSet.Builder builder6= animatorSet
                        .play(tv1BgAnimator)
                        .with(tv1ScaleX)
                        .with(tv1Translate)
                        .before(tv2BgAnimator)
                        .before(tv2ScaleX)
                        .before(tv2Translate);
                break;
            case _TV2__TV1:
                AnimatorSet.Builder builder7= animatorSet
                        .play(tv2BgAnimator)
                        .with(tv2ScaleX)
                        .with(tv2Translate)
                        .before(tv1BgAnimator)
                        .before(tv1ScaleX)
                        .before(tv1Translate);
                break;
            case TV1__TV2:
                AnimatorSet.Builder builder8= animatorSet
                        .play(tv2BgAnimator)
                        .with(tv2ScaleX)
                        .with(tv2Translate)
                        .with(tv1BgAnimator)
                        .with(tv1ScaleX)
                        .with(tv1Translate);
                break;
            case _TV1_BG_SCLAEX_TRANSLATIONY:
                tv1ScaleX.setStartDelay(2000);
                tv1Translate.setStartDelay(4000);
                AnimatorSet.Builder builder9= animatorSet
                        .play(tv1BgAnimator)
                        .with(tv1ScaleX)
                        .with(tv1Translate);
                break;
            case _TV1_TRANSLATIONY_SCLAEX_BG:
                tv1ScaleX.setStartDelay(2000);
                AnimatorSet.Builder builder10= animatorSet
                        .play(tv1BgAnimator)
                        .after(tv1ScaleX)
                        .after(tv1Translate);
                break;
            case _TV2_BG_SCLAEX_TRANSLATIONY:
                tv2ScaleX.setStartDelay(2000);
                tv2Translate.setStartDelay(4000);
                AnimatorSet.Builder builder11= animatorSet
                        .play(tv2BgAnimator)
                        .with(tv2ScaleX)
                        .with(tv2Translate);
                break;
            case _TV2_TRANSLATIONY_SCLAEX_BG:
                tv2ScaleX.setStartDelay(2000);
                AnimatorSet.Builder builder12= animatorSet
                        .play(tv2BgAnimator)
                        .after(tv2ScaleX)
                        .after(tv2Translate);
                break;
            case _TV1_TRANSLATIONY_SCLAEX_BG_TV2_TRANSLATIONY_SCLAEX_BG:
                tv1ScaleX.setStartDelay(2000);
                tv2ScaleX.setStartDelay(2000);
                tv2BgAnimator.setStartDelay(4000);
                AnimatorSet.Builder builder13= animatorSet
                        .play(tv1BgAnimator)
                        .after(tv1ScaleX)
                        .after(tv1Translate)
                        .before(tv2Translate)
                        .before(tv2ScaleX)
                        .before(tv2BgAnimator);
                break;
        }

        animatorSet.setDuration(2000);
        animatorSet.start();
    }


}
