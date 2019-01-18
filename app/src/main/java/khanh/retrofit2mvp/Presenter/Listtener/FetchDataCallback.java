package khanh.retrofit2mvp.Presenter.Listtener;

import java.util.ArrayList;

import khanh.retrofit2mvp.Model.Products;

public interface FetchDataCallback {
    void onFetchSuccess(ArrayList<Products> list);
    void onFetchFault(Exception e);
}
