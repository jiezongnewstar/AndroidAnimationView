package com.xibei.personaldesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.xibei.personaldesign.itemDemo.ActivityAnimation1;
import com.xibei.personaldesign.itemDemo.ActivityAnimation2;
import com.xibei.personaldesign.itemDemo.ActivityAnimation3;
import com.xibei.personaldesign.itemDemo.ActivityAnimation4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv_title;
    List<ItemBean> beans;
    DesignAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_title = findViewById(R.id.lv_title);

        iniaData();

        adapter = new DesignAdapter(beans,this);
        lv_title.setAdapter(adapter);

        lv_title.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this,beans.get(position).activity.getClass()));
            }
        });

    }

    private void iniaData() {
        beans = new ArrayList<>();
        addData(new ActivityAnimation1(),"动画一 : scale、rotate、translate、alpha、set");
        addData(new ActivityAnimation2(),"动画二 : 动画一 + interpolater 效果");
        addData(new ActivityAnimation3(),"动画三 : 代码实现动画效果");
        addData(new ActivityAnimation4(),"动画四 ：View Anmation 和 Value Animator的对比");

    }


    private void addData(Activity activity,String title) {
        ItemBean bean = new ItemBean();
        bean.activity = activity;
        bean.title = title;
        beans.add(bean);
    }


}
