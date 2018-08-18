package com.example.isyandra.scankong.network;

import com.example.isyandra.scankong.pojo.ResponseAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface APIInterface {

    @PUT("index_put")
    Call<ResponseAPI> kodeqr(
            @Query("kodeqr") String kodeqr
    );
}
