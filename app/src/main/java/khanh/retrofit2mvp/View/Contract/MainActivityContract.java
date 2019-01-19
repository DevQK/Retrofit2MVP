package khanh.retrofit2mvp.View.Contract;

import java.util.List;

import khanh.retrofit2mvp.Model.ItemModel.CryptoData;

public interface MainActivityContract {
    interface View {
        void showData(List<CryptoData> data);

        void showError(String message);

        void showComplete();

        void showProgress();

        void hideProgress();
    }

    interface Presenter {
        void loadData();
    }
}