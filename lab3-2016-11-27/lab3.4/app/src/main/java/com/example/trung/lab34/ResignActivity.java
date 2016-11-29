package com.example.trung.lab34;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ResignActivity extends AppCompatActivity {
    private static final String TAG = ResignActivity.class.toString();
    EditText etCustomer;
    EditText etAccsess;
    EditText etPhone;
    EditText etDay;
    EditText etMonth;
    EditText etYear;
    EditText etEmail;
    Button btResign;

    String url = "https://a-server.herokuapp.com/api/register";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resign);

        getReferences();
        setUI();
    }

    private void setUI() {
        btResign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sentPost();
            }
        });
    }

    private void sentPost() {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();

        InforResigner inforResigner = new InforResigner(Integer.parseInt(etPhone.getText().toString()),
                etCustomer.getText().toString(),
                etEmail.getText().toString(),
                etAccsess.getText().toString(),
                Integer.parseInt(etDay.getText().toString()),
                Integer.parseInt(etMonth.getText().toString()),
                Integer.parseInt(etYear.getText().toString())
                );
        final Gson gson = new Gson();
        String data = gson.toJson(inforResigner);
        RequestBody requestBody = RequestBody.create(JSON, data);

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, String.format("onFailure : %s", e));
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String body = response.body().string();

                InforOfAccount inforOfAccount = gson.fromJson(body,InforOfAccount.class);

                Log.d(TAG, String.format("information : %s", inforOfAccount));

            }
        });

    }

    private void getReferences() {
        etCustomer = (EditText) findViewById(R.id.et_customer_name);
        etAccsess = (EditText) findViewById(R.id.et_access_token);
        etPhone = (EditText) findViewById(R.id.et_phone);
        etDay = (EditText) findViewById(R.id.et_day);
        etMonth = (EditText) findViewById(R.id.et_month);
        etYear = (EditText) findViewById(R.id.et_year);
        etEmail = (EditText) findViewById(R.id.et_email);
        btResign = (Button) findViewById(R.id.bt_resign);
    }
}
