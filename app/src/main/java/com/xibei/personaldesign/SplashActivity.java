package com.xibei.personaldesign;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class SplashActivity extends Activity {

    WebView webView;
    Button btn_jump;
    View backView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        final Transition explode = TransitionInflater.from(this).inflateTransition(R.transition.explode);
        setContentView(R.layout.activity_splash);

        webView = findViewById(R.id.webview);
        backView = findViewById(R.id.backView);
        btn_jump = findViewById(R.id.btn_jump);



        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    btn_jump.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            backView.setVisibility(View.VISIBLE);
                            AnimationSet animationSet = new AnimationSet(false);
                            animationSet.addAnimation(new RotateAnimation(0, 90));
                            animationSet.addAnimation(new TranslateAnimation(0f, 0f, 0f, -400f));
                            animationSet.addAnimation(new TranslateAnimation(0f, 900f, 0f, 0f));
                            animationSet.setFillAfter(true);
                            animationSet.setDuration(2000);
                            btn_jump.startAnimation(animationSet);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    getWindow().setExitTransition(explode);
                                    startActivity(new Intent(SplashActivity.this, MainActivity.class),
                                            ActivityOptions.makeSceneTransitionAnimation(SplashActivity.this).toBundle());
                                    finish();
                                }
                            }, 2000);

                        }
                    });
                }
            }
        });

        webView.loadUrl("https://github.com/jiezongnewstar");
        getWindow().setEnterTransition(explode);
    }


}
