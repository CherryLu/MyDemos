package com.dsfa.mydemos.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dsfa.mydemos.R;
import com.dsfa.mydemos.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener,Handler.Callback {

    @Bind(R.id.listview)
    ListView listview;
    @Bind(R.id.swipe)
    SwipeRefreshLayout swipe;
    private MyAdapter myAdapter;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        handler = new Handler(this);
        swipe.setOnRefreshListener(this);
        List<String> list = new ArrayList<>();
        for (int i = 0;i<5;i++){
            list.add("测试");
        }
        myAdapter = new MyAdapter(this,list);
        listview.setAdapter(myAdapter);
    }

    @Override
    public void onRefresh() {
        handler.sendEmptyMessageDelayed(0,1000);
    }

    @Override
    public boolean handleMessage(Message msg) {
        swipe.setRefreshing(false);
        return true;
    }
}
