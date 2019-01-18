package khanh.retrofit2mvp.Model.API;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("getallproducts.php")
    Call<ResponseBody> getAllProduct();

}
