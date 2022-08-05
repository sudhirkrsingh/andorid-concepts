package com.mega.constraintdesign.postretrofitpathandquery;



import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class API {

    private API(){}

    public static final String BASE_URL = " https://rpcauat-api.reciproci.com/";
    private  static volatile Retrofit retrofit = null;


    public static  Retrofit postBody(String androidId) {

            if (retrofit == null) {

                synchronized (API.class) {
                    if (retrofit == null) {
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
                        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);

                        OkHttpClient client = new OkHttpClient.Builder()

                                .addInterceptor(chain -> {
                                    Request request = chain.request()
                                            .newBuilder()
                                            .addHeader("COUNTRY", "United Arab Emirates")
                                            .addHeader("CITY", "Asab")
                                            .addHeader("LANGUAGE", "EN")
                                            .addHeader("IS_FILTERED", "FALSE")
                                            .addHeader("AUTH_TOKEN", "dfV8ntU+f0cikVRBDBg0CA==")
                                            .addHeader("Content-Type", "application/json")
                                            .addHeader("DEVICE_ID", "fPMfRtEnRxCjqPUGREJ9NO")
                                            .addHeader("ANDROID_DEVICE_ID", androidId)
                                            .addHeader("accept", "application/json")
                                            .addHeader("APP_VERSION", "0.1.72")
                                            .build();
                                    return chain.proceed(request);
                                })
                                .addInterceptor(httpLoggingInterceptor)
                                .build();


                        retrofit = new Retrofit.Builder()
                                .baseUrl(BASE_URL)
                                .addConverterFactory(GsonConverterFactory.create())
                                .client(client)
                                .build();

                    }
                }
            }
            return retrofit;
        }

}
