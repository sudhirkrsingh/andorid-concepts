package com.mega.constraintdesign.postretrofitpathandquery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import com.mega.constraintdesign.databinding.ActivityRetrofitPathAndQueryBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitPathAndQueryActivity extends AppCompatActivity {


    ActivityRetrofitPathAndQueryBinding binding;
    int mallId;
    String androidId;

    PostBodyModel postBodyModel = new PostBodyModel();
  
    @SuppressLint("HardwareIds")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRetrofitPathAndQueryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.recview.setLayoutManager(new LinearLayoutManager(RetrofitPathAndQueryActivity.this));

        postBodyModel.setStores("All");

        androidId = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);


        postBody();

    }

    private void postBody() {
        mallId=37907;
        PathAndQuery pathAndQuery= API.postBody(androidId).create(PathAndQuery.class);
        Call<StoreListModel> call = pathAndQuery.postData(mallId,postBodyModel);

       call.enqueue(new Callback<StoreListModel>() {
           @Override
           public void onResponse(@NonNull Call<StoreListModel> call, @NonNull Response<StoreListModel> response) {
               Log.v("Check","Code Checking"+response.code()+response.body());
               if(response.isSuccessful()){
                   StoreListModel storeListModel=response.body();


                   List<StoreSingleModel> storeList = storeListModel.getStores();
                   StoreAdapter adapter = new StoreAdapter(RetrofitPathAndQueryActivity.this,storeList);
                   binding.recview.setAdapter(adapter);
               }
               else {
                   switch (response.code()){

                       case 400:
                           Toast.makeText(RetrofitPathAndQueryActivity.this, "Server returned error: User not found", Toast.LENGTH_SHORT).show();
                           Log.v("400", "Server returned error: User not found");
                           break;

                       case 401:
                           Toast.makeText(RetrofitPathAndQueryActivity.this, "Server returned error: Require user authentication", Toast.LENGTH_SHORT).show();
                           Log.v("401","Server returned error: Require user authentication");
                           break;

                       case 404:
                           Log.v("404","Server returned error:Server cannot find requested resource");
                           Toast.makeText(RetrofitPathAndQueryActivity.this, "Server cannot find requested resource", Toast.LENGTH_SHORT).show();
                           break;

                       case 500:
                           Log.v("500","Server returned error: Server is broken");
                           Toast.makeText(RetrofitPathAndQueryActivity.this, "Server returned error: Server is broken", Toast.LENGTH_SHORT).show();
                           break;

                       default:
                           Log.v("default","Server returned error: There might be some issue");


                   }
               }
           }

           @Override
           public void onFailure(@NonNull Call<StoreListModel> call, @NonNull Throwable t) {
               Log.v("Failure","something went wrong"+t);
               Toast.makeText(RetrofitPathAndQueryActivity.this, "Hi something went wrong"+t, Toast.LENGTH_SHORT).show();

           }
       });



    }
}