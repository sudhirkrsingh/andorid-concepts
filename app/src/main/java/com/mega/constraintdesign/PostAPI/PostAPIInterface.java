package com.mega.constraintdesign.PostAPI;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface PostAPIInterface {

    @Headers({"Content-Type: application/json",
            "Accept-Language: EN",
            "DEVICE_TYPE: Android",
            "APP_VERSION: 0.1.39",
            "COUNTRY: India",
            "CITY: Lucknow",

    })
    @POST("api/ns/customer/v2/update")
    Call<UserDataModel> postUserData(@Header("DEVICE_ID") String device_id,@Header("Authorization") String authorization,@Body UserDataModel userDataModel);

}
