package com.xibei.personaldesign;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        if (mContext == null){
            mContext = this;
        }
    }
}
