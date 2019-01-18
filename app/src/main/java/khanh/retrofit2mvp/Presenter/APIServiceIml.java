package khanh.retrofit2mvp.Presenter;

import android.util.Log;

import org.json.JSONArray;

import khanh.retrofit2mvp.Model.API.APIClient;
import khanh.retrofit2mvp.Model.API.APIService;
import khanh.retrofit2mvp.Model.Products;
import khanh.retrofit2mvp.Presenter.Listtener.FetchDataCallback;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//Dữ liệu trả về  được đưa vào trong listener để xử lý bên presenter.
public class APIServiceIml {
    String TAG = APIServiceIml.class.getSimpleName();
    public void getAllProduct(final FetchDataCallback dataCallback){
        APIService apiService = APIClient.getRetrofit().create(APIService.class);
        Call<ResponseBody> call = apiService.getAllProduct();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    JSONArray arr = new JSONArray(response.body().toString());
                    dataCallback.onFetchSuccess(Products.getAllProducts(arr));
                }catch (Exception e){
                    dataCallback.onFetchFault(e);
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e(TAG, t.toString());
                dataCallback.onFetchFault(new Exception(t));
            }
        });
    }

}
