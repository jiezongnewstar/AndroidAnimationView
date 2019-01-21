package com.xibei.personaldesign.itemDemoHelper;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView extends TextView {

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setCharText(Character character){

        setText(String.valueOf(character));
    }
}
