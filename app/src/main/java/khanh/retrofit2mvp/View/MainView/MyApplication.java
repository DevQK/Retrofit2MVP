package khanh.retrofit2mvp.View.MainView;

import android.app.Activity;
import android.app.Application;

import khanh.retrofit2mvp.Model.ContextModule;
import khanh.retrofit2mvp.View.Component.ApplicationComponent;
import khanh.retrofit2mvp.View.Component.DaggerApplicationComponent;

public class MyApplication extends Application {
    ApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        applicationComponent.injectApplication(this);
    }
    public static MyApplication get(Activity activity){
        return (MyApplication) activity.getApplication();
    }
    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
