package com.xibei.personaldesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.xibei.personaldesign.itemDemo.ActivityAnimation1;
import com.xibei.personaldesign.itemDemo.ActivityAnimation10;
import com.xibei.personaldesign.itemDemo.ActivityAnimation11;
import com.xibei.personaldesign.itemDemo.ActivityAnimation12;
import com.xibei.personaldesign.itemDemo.ActivityAnimation13;
import com.xibei.personaldesign.itemDemo.ActivityAnimation14;
import com.xibei.personaldesign.itemDemo.ActivityAnimation2;
import com.xibei.personaldesign.itemDemo.ActivityAnimation3;
import com.xibei.personaldesign.itemDemo.ActivityAnimation4;
import com.xibei.personaldesign.itemDemo.ActivityAnimation5;
import com.xibei.personaldesign.itemDemo.ActivityAnimation6;
import com.xibei.personaldesign.itemDemo.ActivityAnimation7;
import com.xibei.personaldesign.itemDemo.ActivityAnimation8;
import com.xibei.personaldesign.itemDemo.ActivityAnimation9;

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
                if (position<beans.size()){
                    startActivity(new Intent(MainActivity.this,beans.get(position).activity.getClass()));
                }else {
                    Toast.makeText(MainActivity.this,"敬请期待哦...",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void iniaData() {
        beans = new ArrayList<>();
        addData(new ActivityAnimation1(),"动画 1 : scale、rotate、translate、alpha、set");
        addData(new ActivityAnimation2(),"动画 2 : 动画一 + interpolater 效果");
        addData(new ActivityAnimation3(),"动画 3 : 代码实现动画效果");
        addData(new ActivityAnimation4(),"动画 4 ：View Anmation 和 Value Animator的对比");
        addData(new ActivityAnimation5(),"动画 5 ：Value Animator 插值器");
        addData(new ActivityAnimation6(),"动画 6 ：Value Animator Evaluator");
        addData(new ActivityAnimation7(),"动画 7 ：Value Animator ofObject");
        addData(new ActivityAnimation8(),"动画 8 ：Object Animator");
        addData(new ActivityAnimation9(),"动画 9 ：Object Animator 自定义set方法");
        addData(new ActivityAnimation10(),"动画 10 ：PropertyValuesHolder ofint、object和float方法");
        addData(new ActivityAnimation11(),"动画 11 ：PropertyValuesHolder KeyFrame方法");
        addData(new ActivityAnimation12(),"动画 12 ：联合动画");
        addData(new ActivityAnimation13(),"动画 13 ：联合动画示例");
        addData(new ActivityAnimation14(),"动画 14 ：代码实现layout、gridlayoutanimation");
    }


    private void addData(Activity activity,String title) {
        ItemBean bean = new ItemBean(title);
        bean.activity = activity;
        bean.title = title;
        beans.add(bean);
    }


}
