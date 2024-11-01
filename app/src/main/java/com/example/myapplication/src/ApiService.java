package com.example.myapplication.src;

import com.example.myapplication.entity.model.TokenRequest;
import com.example.myapplication.entity.model.TokenResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("your_endpoint_here")
    Call<TokenResponse> getToken(@Body TokenRequest request);
}