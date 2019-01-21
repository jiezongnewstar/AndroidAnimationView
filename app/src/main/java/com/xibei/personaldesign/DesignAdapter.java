package com.xibei.personaldesign;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;
import android.widget.TextView;

public class DesignAdapter extends BaseAdapter {

    List<ItemBean> beans;

    Context context;

    public DesignAdapter(List<ItemBean> beans, Context context) {
        this.beans = beans;
        this.context = context;
    }

    @Override
    public int getCount() {
        return beans.size()+1;
    }


    @Override
    public Object getItem(int position) {
        return beans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_demo,null);
            holder = new Holder();
            holder.tv_title = convertView.findViewById(R.id.tv_titile);
            convertView.setTag(holder);
        }else {
            holder = (Holder) convertView.getTag();
        }

        if (position==beans.size()){
            holder.tv_title.setText("       正在学习中，未完待续。尽请期待哦...");
        }else {
            holder.tv_title.setText(beans.get(position).title);
        }

        return convertView;
    }


    class Holder{
        TextView tv_title;
    }
}
