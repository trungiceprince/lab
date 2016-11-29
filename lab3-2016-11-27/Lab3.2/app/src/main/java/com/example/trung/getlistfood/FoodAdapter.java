package com.example.trung.getlistfood;

import android.content.Context;
import android.widget.ArrayAdapter;


import java.util.List;

/**
 * Created by trung on 11/27/2016.
 */
public class FoodAdapter extends ArrayAdapter<D>{

    public FoodAdapter(Context context, int resource, List<D> objects) {
        super(context, resource, objects);
    }

//    @NonNull
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater layoutInflater = LayoutInflater.from(this.getContext());
//        if (convertView == null) {
//            convertView = layoutInflater.inflate(R.layout.list_item_food, parent, false);
//        }
//        D salon = getItem(position);
//
//        TextView tvFoodName = (TextView) convertView.findViewById(R.id.tv_food_name);
//        TextView tvFoodDetail = (TextView) convertView.findViewById(R.id.tv_food_detail);
//        TextView tvFoodprice = (TextView) convertView.findViewById(R.id.tv_food_price);
//        ImageView ivFood = (ImageView) convertView.findViewById(R.id.iv_food);
//
//        Picasso.with(this.getContext()).load(salon.getImage()).into(ivFood);
//        tvFoodName.setText(salon.getName());
//        tvFoodDetail.setText(salon.getDetail());
//        tvFoodprice.setText(String.format("%s.000 VND", salon.getPrice()));
//
//        return convertView;
//
//    }
}
