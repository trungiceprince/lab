package com.example.trung.s9_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.toString();
    EditText etUserName;
    EditText etPassWord;
    Button btLogin;

    String url = "https://a5-tumblelog.herokuapp.com/api/login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getReferences();
        addListener();

    }

    private void addListener() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClick");
                MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                OkHttpClient client = new OkHttpClient();
                String userName = etUserName.getText().toString();
                String password = etPassWord.getText().toString();
                Log.d(TAG, String.format("Login: username : %s", userName));
                Log.d(TAG, String.format("Login: password : %s", password));
                final Login login = new Login(userName,password);
                final Gson gson = new Gson();
                String data = gson.toJson(login);
                final RequestBody requestBody = RequestBody.create(JSON,data);

                //3 create request
                Request  request = new Request.Builder()
                        .url(url)
                        .post(requestBody)
                        .build();

                //4 send request
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Log.d(TAG, String.format("POST onFailure: %s", e));
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        String body = response.body().string();
                        Log.d(TAG, String.format("POST onResponse: %s ", body));

                        try {
                            JSONObject jsonObject = new JSONObject(body);
                            int code = jsonObject.getInt("code");
                            final String message = jsonObject.getString("message");
                            Log.d(TAG, String.format("Code: %s, %s", code, message));

                            MainActivity.this.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(MainActivity.this,
                                            String.format("%s",message),
                                            Toast.LENGTH_LONG)
                                            .show();
                                }
                            });
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });

            }
        });
    }

    private void getReferences() {
        etUserName = (EditText) findViewById(R.id.et_user_name);
        etPassWord = (EditText) findViewById(R.id.et_password);
        btLogin = (Button) findViewById(R.id.bt_login);
    }

}
