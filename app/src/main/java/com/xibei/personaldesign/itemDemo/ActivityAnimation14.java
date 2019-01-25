package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import com.xibei.personaldesign.DesignAdapter;
import com.xibei.personaldesign.ItemBean;
import com.xibei.personaldesign.R;

import java.util.ArrayList;
import java.util.List;

public class ActivityAnimation14 extends Activity {

    ListView lv_datas;

    GridView gv_datas;

    DesignAdapter adapter;

    List<ItemBean> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_14);
        gv_datas = findViewById(R.id.gv_datas);
        lv_datas = findViewById(R.id.lv_datas);
        initData();
        initAnimation();

    }

    private void initAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.main_list_slide_in_left);

        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animation);
        layoutAnimationController.setDelay(0.3f);
        layoutAnimationController.setOrder(LayoutAnimationController.ORDER_NORMAL);
        lv_datas.setLayoutAnimation(layoutAnimationController);
        lv_datas.startLayoutAnimation();

        GridLayoutAnimationController gridLayoutAnimationController = new GridLayoutAnimationController(animation);
        gridLayoutAnimationController.setRowDelay(0.3f);
        gridLayoutAnimationController.setColumnDelay(0.5f);
        gridLayoutAnimationController.setDirectionPriority(GridLayoutAnimationController.PRIORITY_NONE);
        gv_datas.setLayoutAnimation(gridLayoutAnimationController);
        gv_datas.startLayoutAnimation();
    }

    private void initData() {
        dataList = new ArrayList<>();
        for (int i = 0;i<=9;i++){
            dataList.add(new ItemBean("data"+i));
        }
        adapter = new DesignAdapter(dataList,this);
        lv_datas.setAdapter(adapter);
        gv_datas.setAdapter(adapter);

    }

}
