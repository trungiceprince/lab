package com.example.trung.getlistfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.toString();
//    private ArrayAdapter<D> salonArrayAdapter;
//    private ArrayList<D> dArrayList;
//    ListView lvFoodlist;

    private String url = "http://a-server.herokuapp.com/api/salon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        lvFoodlist = (ListView) findViewById(R.id.lv_food_list);

//        initData();
//        cofigUI();
        sendGET();
    }

    private void sendGET() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, String.format("onFailure: %s", e));
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String body = response.body().string();
                Gson gson = new Gson();

                FatherSalon ds = gson.fromJson(body,FatherSalon.class);

                Log.d(TAG, String.format("Salon : %s", ds));


            }
        });
    }

//    private void cofigUI() {
//        salonArrayAdapter = new FoodAdapter(this,R.layout.list_item_food, dArrayList);
//        lvFoodlist.setAdapter(salonArrayAdapter);
//    }
//
//    private void initData() {
//        dArrayList = new ArrayList<>();
//    }
}
