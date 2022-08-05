package com.mega.constraintdesign.PostAPI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.mega.constraintdesign.R;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DanbroPostActivity extends AppCompatActivity {

    ImageView profileImg;
    String androidId;
    EditText userName,userLastName,userDob,userGender,userEmail,userPhone,userCountry,userCity,userCountryResidence,userHomeAddress;
    AppCompatButton postButton;
    UserDataModel userDataModel= new UserDataModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danbro_post);

        profileImg=findViewById(R.id.profile_image);
        userName=findViewById(R.id.user_name);
        userLastName=findViewById(R.id.user_last_name);
        userDob=findViewById(R.id.user_dob);
        userGender=findViewById(R.id.user_gender);
        userEmail=findViewById(R.id.user_email);
        userPhone=findViewById(R.id.user_phone);
        userCountry=findViewById(R.id.user_country);
        userCity=findViewById(R.id.user_city);
        userCountryResidence=findViewById(R.id.user_country_residence);
        userHomeAddress=findViewById(R.id.user_home_add);
        postButton=findViewById(R.id.post_btn);


        postButton.setOnClickListener(view -> {

//
//            if(userCity.getText().toString().isEmpty() || userCountry.getText().toString().isEmpty() || userDob.getText().toString().isEmpty() || userEmail.getText().toString().isEmpty() || userName.getText().toString().isEmpty() || userGender.getText().toString().isEmpty() || userLastName.getText().toString().isEmpty() || userPhone.getText().toString().isEmpty() || userCountryResidence.getText().toString().isEmpty() ){
//
//                Toast.makeText(DanbroPostActivity.this, "Please put the essential data", Toast.LENGTH_SHORT).show();
//            }
//            else {

                userDataModel.setAddress(null);
                userDataModel.setCityOid(14);
                userDataModel.setCountryOid(1);
                userDataModel.setDateOfBirth("2007-06-08");
                userDataModel.setEmail("k@gmail.com");
                userDataModel.setFirstName(userName.getText().toString());
                userDataModel.setGender("Male");
                userDataModel.setImagePath(null);
                userDataModel.setLastName(userLastName.getText().toString());
                userDataModel.setMobileNo("917289982767");
                userDataModel.setNationalityOid(Integer.valueOf(userCountryResidence.getText().toString()));
                postData();
//            }
        });

    }

    @SuppressLint("HardwareIds")
    private void postData() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://danbro-api-uat.reciproci.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        androidId = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);

        PostAPIInterface retrofitAPI = retrofit.create(PostAPIInterface.class);

        Call<UserDataModel> call = retrofitAPI.postUserData(androidId," bearer bfee93bc-b0e7-4339-a2c3-70f63ffcf0a1",userDataModel);

        call.enqueue(new Callback<UserDataModel>() {
            @Override
            public void onResponse(Call<UserDataModel> call, Response<UserDataModel> response) {

                Log.v("post", "Yeah its working"+response.code());

                if (response.isSuccessful()) {
                    Log.v("200", "Data is being stored in server");
                } else {

                    switch (response.code()){

                        case 400:
                            Log.v("400", "Server returned error: User not found");
                            break;

                        case 500:
                            Log.v("500","Server returned error: Server is broken");
                            break;

                        default:
                            Log.v("default","Server returned error: There might be some issue");


                    }
                }
            }


            @Override
            public void onFailure(Call<UserDataModel> call, Throwable t) {
                Log.v("error","this is error"+t.getMessage());
                Toast.makeText(DanbroPostActivity.this, "Failure"+t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });


    }


}