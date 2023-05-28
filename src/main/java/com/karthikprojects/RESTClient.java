package com.karthikprojects;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*RestClient Class used to handle API.The RetroFit class is actually created by builder design pattern and also Decorator Design Pattern  .The Retrofit class generates an implementation of the JSONResponseAPI interface. */
public class RESTClient {
    private JSONResponseAPI jsonResponseAPI;
    public JSONResponseAPI getRestClient(){
        return this.jsonResponseAPI;
    }
    RESTClient(){
    Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com").client(new OkHttpClient())
            .build();

    jsonResponseAPI = retrofit.create(JSONResponseAPI.class);
    }
}
