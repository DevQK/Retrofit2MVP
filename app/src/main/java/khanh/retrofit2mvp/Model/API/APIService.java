package khanh.retrofit2mvp.Model.API;


import java.util.List;

import khanh.retrofit2mvp.Model.ItemModel.CryptoData;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface APIService {
    @GET("ticker/?")
    Observable<List<CryptoData>> getData(@Query("limit") String limit);
}
