package khanh.retrofit2mvp.View.Component;

import android.content.Context;

import dagger.Component;
import khanh.retrofit2mvp.MainActivity;
import khanh.retrofit2mvp.Model.AdapterModule;
import khanh.retrofit2mvp.Model.MainActivityMvpModule;
import khanh.retrofit2mvp.View.Qualifier.ActivityContent;
import khanh.retrofit2mvp.View.Scopes.ActivityScopes;

@ActivityScopes
@Component(modules = {AdapterModule.class, MainActivityMvpModule.class}, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {
    @ActivityContent
    Context getContext();
    void injectMainActivity(MainActivity mainActivity);
}
