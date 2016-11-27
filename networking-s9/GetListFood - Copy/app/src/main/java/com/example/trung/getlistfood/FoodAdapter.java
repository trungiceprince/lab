package com.example.trung.getlistfood;

import android.content.Context;
import android.support.annotation.NonNull;
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
public class FoodAdapter extends ArrayAdapter<FoodItem>{

    public FoodAdapter(Context context, int resource, List<FoodItem> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.getContext());
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_food, parent, false);
        }
        FoodItem foodItem = getItem(position);

        TextView tvFoodName = (TextView) convertView.findViewById(R.id.tv_food_name);
        TextView tvFoodDetail = (TextView) convertView.findViewById(R.id.tv_food_detail);
        TextView tvFoodprice = (TextView) convertView.findViewById(R.id.tv_food_price);
        ImageView ivFood = (ImageView) convertView.findViewById(R.id.iv_food);

        Picasso.with(this.getContext()).load(foodItem.getImage()).into(ivFood);
        tvFoodName.setText(foodItem.getName());
        tvFoodDetail.setText(foodItem.getDetail());
        tvFoodprice.setText(String.format("%s.000 VND", foodItem.getPrice()));

        return convertView;

    }
}
