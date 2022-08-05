package com.mega.constraintdesign.GetRetrofitGiftCardStore;

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

public class GiftCardActivity extends AppCompatActivity {

    RecyclerView giftCardRecycler;
    CardApiInterface cardApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_card);
        giftCardRecycler=findViewById(R.id.gift_card_recycler);
        giftCardRecycler.setLayoutManager(new LinearLayoutManager(GiftCardActivity.this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://rpcauat-api.reciproci.com/cans/tt/rest/api/sec/v1/giftCard/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        cardApiInterface=retrofit.create(CardApiInterface.class);
        
        getGiftCards();
        
    }

    private void getGiftCards() {
        Call<GiftCardStoreResponse> call =cardApiInterface.getGiftCard();
        call.enqueue(new Callback<GiftCardStoreResponse>() {
            @Override
            public void onResponse(Call<GiftCardStoreResponse> call, Response<GiftCardStoreResponse> response) {
                if(!response.isSuccessful()){
                    Log.e("tag1","Error"+response.code());

                }
                else {
                    Log.e("tag2", "success");
                    GiftCardStoreResponse output = response.body();
                    List<GiftCardModel> userList = output.getGiftCardResponseList();
                    GiftCardAdapter adapter = new GiftCardAdapter(userList,GiftCardActivity.this);
                    giftCardRecycler.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<GiftCardStoreResponse> call, Throwable t) {

                Log.e("tag3",t.getMessage());
                Toast.makeText(GiftCardActivity.this,t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}