package com.example.isyandra.scankong.network;


import retrofit2.Call;
import retrofit2.Callback;

public class APIService {
    private APIInterface apiInterface;

    public APIService(){
        apiInterface = APIClient.builder().create(APIInterface.class);
    }

    public void kodeqr(String kodeqr, Callback callback){
        apiInterface.kodeqr(kodeqr).enqueue(callback);
    }
}
