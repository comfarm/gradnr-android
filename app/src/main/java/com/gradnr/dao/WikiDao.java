package com.gradnr.dao;

import com.gradnr.dto.ItemDTO;
import com.gradnr.dto.UserDTO;
import com.gradnr.dto.WikiDTO;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by bri on 7/1/17.
 */

public interface WikiDao {

    @GET("/api/wiki/item/{itemId}")
    Call<ItemDTO> getItem(@Path("itemId") int itemId);

    @GET("/api/wiki/{wikiId}")
    Call<WikiDTO> getWiki(@Path("wikiId") int wikiId);

}