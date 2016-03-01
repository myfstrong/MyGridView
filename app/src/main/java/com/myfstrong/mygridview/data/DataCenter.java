package com.myfstrong.mygridview.data;

import android.media.Image;
import android.widget.ImageView;

import com.myfstrong.mygridview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/1 0001.
 */
public class DataCenter {
    public static List<Merchandise> getData() {
        List<Merchandise> list = new ArrayList<Merchandise>();

        Merchandise mMer_1st = new Merchandise();
        mMer_1st.setImageView(R.drawable.pic1);

        Merchandise mMer_2nd = new Merchandise();
        mMer_2nd.setImageView(R.drawable.pic2);

        Merchandise mRer_3th = new Merchandise();
        mRer_3th.setImageView(R.drawable.pic3);

        list.add(mMer_1st);
        list.add(mMer_2nd);
        list.add(mRer_3th);

        return list;
    }
}
