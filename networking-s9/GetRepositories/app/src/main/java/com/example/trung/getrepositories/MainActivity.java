package com.example.trung.getrepositories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.trung.getrepositories.models.Owner;
import com.example.trung.getrepositories.models.Repositorie;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.toString();
    private String url = "https://api.github.com/repositories";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, String.format("on Failure: %s", e));
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String body = response.body().string();
                Gson gson = new Gson();
                Repositorie[] repositories = gson.fromJson(body,Repositorie[].class);

                for (Repositorie repositorie : repositories){
                    String name = repositorie.getNameUser();
                    String login = repositorie.getOwnerUser().getLoginUser();
                    String avatar_url = repositorie.getOwnerUser().getAvatarUrl();
                    Log.d(TAG, String.format("name: %s, \nlogin: %s, \navatar: %s", name, login, avatar_url));
                }
            }
        });
    }
}
