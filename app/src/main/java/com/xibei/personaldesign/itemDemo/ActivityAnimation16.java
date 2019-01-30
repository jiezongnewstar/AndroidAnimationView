package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.xibei.personaldesign.R;

import java.util.ArrayList;
import java.util.List;

public class ActivityAnimation16 extends Activity {
    ListView lv_data;
    List<String> datas;
    ListAdapter adapter;
    private int mFirstTop, mFirstPosition;
    private boolean isScrollDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_animation_16);
        lv_data = findViewById(R.id.lv_data);
        initData();
        adapter = new ListAdapter();
        lv_data.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                View firstChild = view.getChildAt(0);
                if (firstChild == null) return;
                int top = firstChild.getTop();
                /**
                 * firstVisibleItem > mFirstPosition表示向下滑动一整个Item
                 * mFirstTop > top表示在当前这个item中滑动
                 */
                isScrollDown = firstVisibleItem > mFirstPosition || mFirstTop > top;
                mFirstTop = top;
                mFirstPosition = firstVisibleItem;
            }
        });
        lv_data.setAdapter(adapter);
    }

    private void initData() {
        datas = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            datas.add("第" + i + "个item");
        }
    }

    public int getbgColor(int position) {
        if (position % 4 == 0) {
            return Color.argb(255, 220, 20, 60);
        } else if (position % 4 == 1) {
            return Color.argb(255, 255, 165, 0);
        } else if (position % 4 == 2) {
            return Color.argb(255, 255, 255, 0);
        } else if (position % 4 == 3) {
            return Color.argb(255, 0, 165, 0);
        }

        return 0;
    }


    class ListAdapter extends BaseAdapter {

        private Animation animation;

        public ListAdapter() {
            animation = AnimationUtils.loadAnimation(ActivityAnimation16.this, R.anim.bottom_in_anim);

        }


        @Override
        public int getCount() {
            return datas.size();
        }

        @Override
        public Object getItem(int position) {
            return datas.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Holder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(ActivityAnimation16.this).inflate(R.layout.item_list16, null);
                holder = new Holder();
                holder.ll_backround = convertView.findViewById(R.id.ll_background);
                holder.tv_number = convertView.findViewById(R.id.tv_number);
                convertView.setTag(holder);
            } else {
                holder = (Holder) convertView.getTag();
            }
            //清除当前显示区域中所有item的动画
            for (int i=0;i<lv_data.getChildCount();i++){
                View view = lv_data.getChildAt(i);
                view.clearAnimation();
            }
            //然后给当前item添加上动画
            if (isScrollDown) {
                convertView.startAnimation(animation);
            }


            holder.tv_number.setText(datas.get(position));
            holder.ll_backround.setBackgroundColor(getbgColor(position));


            return convertView;
        }
    }

    class Holder {
        LinearLayout ll_backround;
        TextView tv_number;
    }
}
