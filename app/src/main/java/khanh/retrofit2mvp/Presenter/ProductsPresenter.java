package khanh.retrofit2mvp.Presenter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import khanh.retrofit2mvp.Model.Products;
import khanh.retrofit2mvp.Model.API.APIServiceIml;
import khanh.retrofit2mvp.Presenter.Listtener.FetchDataCallback;
import khanh.retrofit2mvp.View.ProductsAdapter;

public class ProductsPresenter extends BasePresenter{

    String TAG = ProductsPresenter.class.getSimpleName();
    private RecyclerView.LayoutManager layoutManager;
    private ProductsAdapter adap;
    private ArrayList<Products> productslist;
    APIServiceIml apiServiceIml;

    public ProductsPresenter(Context ct, RecyclerView recyclerView) {
        super(ct);

        apiServiceIml = new APIServiceIml();
        layoutManager = new GridLayoutManager(ct, 2);
        recyclerView.setLayoutManager(layoutManager);
        productslist = new ArrayList<>();
        adap = new ProductsAdapter(productslist , ct);
        recyclerView.setAdapter(adap);
    }
    //Hàm Chuyển dữ liệu
    public void fetchData() {
        apiServiceIml.getAllProduct(new FetchDataCallback() {
            @Override
            public void onFetchSuccess(ArrayList<Products> list) {
                Log.d(TAG, list.toString());
                productslist.addAll(list);
                adap.notifyDataSetChanged();
            }

            @Override
            public void onFetchFault(Exception e) {

            }
        });
    }
}
