package com.mega.constraintdesign.Retrofitgetuser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("posts")
    Call<List<UserModel>> getPost();
}
