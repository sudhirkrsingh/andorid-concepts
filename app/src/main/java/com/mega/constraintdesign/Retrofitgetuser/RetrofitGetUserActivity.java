package com.mega.constraintdesign.Retrofitgetuser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mega.constraintdesign.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitGetUserActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_get_user);

        recyclerView=findViewById(R.id.recView);
        recyclerView.setLayoutManager(new LinearLayoutManager(RetrofitGetUserActivity.this));


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

       apiInterface = retrofit.create(ApiInterface.class);

        getUserData();

    }

    /*
    @Date : 20
    @author:
    Used for geting user data

     */
    private void getUserData() {
        Call<List<UserModel>> call =apiInterface.getPost();
        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                if(!response.isSuccessful()){

                    Toast.makeText(RetrofitGetUserActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Log.e("As", "success");
                    List<UserModel> userList = response.body();
                    UserAdapter adapter = new UserAdapter(RetrofitGetUserActivity.this, userList);
                    recyclerView.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {

                Toast.makeText(RetrofitGetUserActivity.this,t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}