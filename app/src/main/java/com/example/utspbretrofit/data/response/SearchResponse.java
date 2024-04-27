package com.example.utspbretrofit.data.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResponse {
    @SerializedName("items")
    private List<ListUser> users;

    public List<ListUser> getUsers() {
        return users;
    }
}