package khanh.retrofit2mvp.Presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class ProductsPresenter extends BasePresenter{

    String TAG = ProductsPresenter.class.getSimpleName();
    private RecyclerView recyclerView;


    public ProductsPresenter(Context ct) {
        super(ct);
    }
}
