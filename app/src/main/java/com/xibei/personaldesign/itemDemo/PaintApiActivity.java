package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.graphics.Paint;

import com.xibei.personaldesign.itemDemoHelper.paintHelper.PaintVIew;

/**
 * Created by Xibei on 2019/6/5.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration: Paint 详解
 */
public class PaintApiActivity extends Activity {

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(new PaintVIew(this));
    }
}
