package com.myfstrong.mygridview.data;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

import com.myfstrong.mygridview.R;

/**
 * Created by Administrator on 2016/3/1 0001.
 */
public class Merchandise {
    private ImageView imageView;
    private TextView mTxt_Name;
    private TextView mTxt_Price;

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(int recourseId) {
        this.imageView.findViewById(recourseId);
    }

    public TextView getmTxt_Name() {
        return mTxt_Name;
    }

    public void setmTxt_Name(TextView mTxt_Name) {
        this.mTxt_Name = mTxt_Name;
    }

    public TextView getmTxt_Price() {
        return mTxt_Price;
    }

    public void setmTxt_Price(TextView mTxt_Price) {
        this.mTxt_Price = mTxt_Price;
    }
}
