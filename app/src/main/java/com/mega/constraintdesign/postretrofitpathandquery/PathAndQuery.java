package com.mega.constraintdesign.postretrofitpathandquery;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PathAndQuery {

    @POST("cans/tt/rest/api/sec/v4/MallStores.json/{mallId}")
    Call<StoreListModel> postData(@Path ("mallId") int mallId,@Body PostBodyModel postBodyModel);

}
