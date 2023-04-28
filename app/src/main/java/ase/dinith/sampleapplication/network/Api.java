package ase.dinith.sampleapplication.network;

import ase.dinith.sampleapplication.model.DataResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://www.hpb.health.gov.lk/api/";
    @GET("get-current-statistical")
    Call<DataResponse> getHealthUpdate();
}
