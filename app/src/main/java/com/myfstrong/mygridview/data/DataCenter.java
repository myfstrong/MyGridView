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
        mMer_1st.setmImg_id(R.drawable.pic1);
        mMer_1st.setmTxt_Name("iPhone6");
        mMer_1st.setmTxt_Price(5599.00f);

        Merchandise mMer_2nd = new Merchandise();
        mMer_2nd.setmImg_id(R.drawable.pic2);
        mMer_2nd.setmTxt_Name("华为 荣耀6");
        mMer_2nd.setmTxt_Price(2199.00f);

        Merchandise mMer_3th = new Merchandise();
        mMer_3th.setmImg_id(R.drawable.pic3);
        mMer_3th.setmTxt_Name("小米 Note2");
        mMer_3th.setmTxt_Price(1899.00f);


        list.add(mMer_1st);
        list.add(mMer_2nd);
        list.add(mMer_3th);

        return list;
    }
}
