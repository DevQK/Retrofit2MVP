package khanh.retrofit2mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import khanh.retrofit2mvp.Presenter.ProductsPresenter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private ProductsPresenter productsPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        productsPresenter = new ProductsPresenter(this, recyclerView);
    }
    @OnClick(R.id.btnGetData)
    public void getData() {
        productsPresenter.fetchData();

    }
}
