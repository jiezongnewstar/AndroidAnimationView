package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.xibei.personaldesign.R;

public class ActivityAnimation15 extends Activity implements View.OnClickListener {

    Button btn_add,btn_remove;
    LinearLayout ly_container;
    int i =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_15);
        btn_add = findViewById(R.id.btn_add);
        btn_remove = findViewById(R.id.btn_remove);
        ly_container = findViewById(R.id.ly_container);
        btn_add.setOnClickListener(this);
        btn_remove.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      if (v.getId()==R.id.btn_add){
          setBtn_add();
      }else {
          setBtn_remove();
      }
    }


    private void setBtn_add(){
        i++;
        Button button = new Button(this);
        button.setText("btn"+i);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        button.setLayoutParams(params);
        ly_container.addView(button);
    }


    private void setBtn_remove(){
        if (i>0){
            ly_container.removeViewAt(0);
            i--;
        }

    }


}
