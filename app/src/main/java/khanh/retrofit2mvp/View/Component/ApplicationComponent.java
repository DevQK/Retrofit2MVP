package khanh.retrofit2mvp.View.Component;

import android.content.Context;

import dagger.Component;
import khanh.retrofit2mvp.Model.API.APIService;
import khanh.retrofit2mvp.Model.ContextModule;
import khanh.retrofit2mvp.Model.API.RetrofitModule;
import khanh.retrofit2mvp.View.MainView.MyApplication;
import khanh.retrofit2mvp.View.Qualifier.ApplicationContent;
import khanh.retrofit2mvp.View.Scopes.ApplicationScopes;

@ApplicationScopes
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {
    APIService getApiInterface();
    @ApplicationContent
    Context getContext();
    void injectApplication(MyApplication application);
}
