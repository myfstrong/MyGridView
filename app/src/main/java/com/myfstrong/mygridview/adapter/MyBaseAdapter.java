package com.myfstrong.mygridview.adapter;

import android.content.Context;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myfstrong.mygridview.R;
import com.myfstrong.mygridview.data.Merchandise;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2016/3/1 0001.
 */
public class MyBaseAdapter extends BaseAdapter{

    Context context;
    List<Merchandise> list;

    public MyBaseAdapter(Context context,List<Merchandise> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        if(list == null || list.size() <= 0)
            return 0;
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return list.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ViewGroup viewGroup = (ViewGroup)layoutInflater.inflate(R.layout.layout_gridview, null);

        ImageView imageView = (ImageView)viewGroup.findViewById(R.id.imageView);
        imageView.setImageResource(list.get(position).getmImg_id());

        TextView mTxt_Name = (TextView)viewGroup.findViewById(R.id.txt_Name);
        mTxt_Name.setText(list.get(position).getmTxt_Name());

        TextView mTxt_Price = (TextView)viewGroup.findViewById(R.id.txt_Price);
        mTxt_Price.setText(list.get(position).getmTxt_Price() + "");

        return viewGroup;
    }
}
