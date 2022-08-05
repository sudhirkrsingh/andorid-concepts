package com.mega.constraintdesign.GetRetrofitGiftCardStore;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface CardApiInterface {


    @Headers({"AUTH_TOKEN: NJ7FkM0RYiRB4iKR5z4HyQ==","Language: EN","COUNTRY: United Arab Emirates","CITY: Dubai","DEVICE_ID: cw4M6_7CRsO2hRhA9NSyqC","deviceId: cw4M6_7CRsO2hRhA9NSyqC","APP_VERSION: 0.1.71","Content-Type: application/json"})
    @GET("giftCardDetails.json")
    Call<GiftCardStoreResponse> getGiftCard();
}
