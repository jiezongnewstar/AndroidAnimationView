package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xibei.personaldesign.R;
import com.xibei.personaldesign.itemDemoHelper.RangeView;

public class ActivityView4 extends Activity implements View.OnClickListener {

    private RangeView rangeView;

    private Button btn_01,btn_02,btn_03,btn_04,btn_05,btn_06,btn_07
            ,btn_08,btn_09,btn_10,btn_11,btn_12,btn_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view_4);
        initView();

    }

    private void initView() {
        rangeView = findViewById(R.id.rangerView);
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
        btn_12 = findViewById(R.id.btn_12);
        btn_13 = findViewById(R.id.btn_13);
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

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_01:
                rangeView.setString("default");
                break;
            case R.id.btn_02:
                rangeView.setString("setEmpty");
                break;
            case R.id.btn_03:
                rangeView.setString("setRegion");
                break;
            case R.id.btn_04:
                rangeView.setString("setRect");
                break;
            case R.id.btn_05:
                rangeView.setString("setLftb");
                break;
            case R.id.btn_06:
                rangeView.setString("setPathRegion");
                break;
            case R.id.btn_07:
                rangeView.setString("regionIterator");
                break;
            case R.id.btn_08:
                rangeView.setString("DIFFERENCE");//最终区域为region1 与 region2不同的区域
                break;
            case R.id.btn_09:
                rangeView.setString("INTERSECT");// 最终区域为region1 与 region2相交的区域
                break;
            case R.id.btn_10:
                rangeView.setString("UNION");//最终区域为region1 与 region2组合一起的区域
                break;
            case R.id.btn_11:
                rangeView.setString("XOR");//最终区域为region1 与 region2相交之外的区域
                break;
            case R.id.btn_12:
                rangeView.setString("REVERSE_DIFFERENCE");//最终区域为region2 与 region1不同的区域
                break;
            case R.id.btn_13:
                rangeView.setString("REPLACE");//最终区域
                break;



        }
    }
}
