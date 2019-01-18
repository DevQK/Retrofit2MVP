package khanh.retrofit2mvp.Model.API;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIClient {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null)
            retrofit = new Retrofit.Builder().baseUrl(Constant.URLANDROID).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
