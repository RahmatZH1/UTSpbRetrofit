package com.example.utspbretrofit.data.retrofit;

import com.example.utspbretrofit.data.response.ListUser;
import com.example.utspbretrofit.data.response.SearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization: token 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"})
    @GET("search/users")
    Call<SearchResponse> searchUsers(@Query("q") String query);

    @Headers({"Authorization: token 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"})
    @GET("users/{username}")
    Call<ListUser> getUser(@Path("username") String username);


}
