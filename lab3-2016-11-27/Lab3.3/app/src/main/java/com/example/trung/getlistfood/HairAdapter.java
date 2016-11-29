package com.example.trung.getlistfood;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by trung on 11/27/2016.
 */
public class HairAdapter extends ArrayAdapter<D>{

    private static final String TAG = HairAdapter.class.toString();

    public HairAdapter(Context context, int resource, List<D> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.getContext());
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_food, parent, false);
        }
        D d = getItem(position);
//
        TextView tvHair = (TextView) convertView.findViewById(R.id.tv_hair);
        TextView tvInfor = (TextView) convertView.findViewById(R.id.tv_infor);
        ImageView ivImage = (ImageView) convertView.findViewById(R.id.iv_image);

        Picasso.with(this.getContext()).load(String.valueOf(d.getImagesHair().get(0).getUrl())).into(ivImage);
        tvHair.setText(d.getTitleHair());
        Log.d(TAG, String.format("Hair: %s", tvHair));
        tvInfor.setText(d.getDescriptionHair());
        Log.d(TAG, String.format("Hair: %s", tvInfor));
//        tvFoodName.setText(salon.getName());
//        tvFoodDetail.setText(salon.getDetail());
//        tvFoodprice.setText(String.format("%s.000 VND", salon.getPrice()));
//
        return convertView;
//
    }
}
