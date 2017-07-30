package com.dsfa.mydemos.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dsfa.mydemos.R;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<String> list;

    public MyAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return list==null?null:list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView = View.inflate(context, R.layout.item,null);
        }
        return convertView;
    }
}
