package com.crystal.newsapp.network;

import com.crystal.newsapp.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country);

    @GET("everything")
    Call<NewsResponse> getEverything(
            @Query("q") String query, @Query("pageSize") int pageSize);

}
