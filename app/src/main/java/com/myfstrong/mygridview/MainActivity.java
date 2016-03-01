package com.myfstrong.mygridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.myfstrong.mygridview.adapter.MyBaseAdapter;
import com.myfstrong.mygridview.data.Merchandise;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //关联控件
        gridView = (GridView)findViewById(R.id.gridView);

        //获取数据
        List<Merchandise> list = new ArrayList<Merchandise>();

        //构造适配器
        BaseAdapter baseAdapter = new MyBaseAdapter(this，list);

        gridView.setAdapter(baseAdapter);
    }
}
