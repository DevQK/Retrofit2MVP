package khanh.retrofit2mvp.Model;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import khanh.retrofit2mvp.MainActivity;
import khanh.retrofit2mvp.View.Qualifier.ActivityContent;
import khanh.retrofit2mvp.View.Scopes.ActivityScopes;
@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;
    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }
    @Provides
    @ActivityScopes
    public MainActivity providesMainActivity(){
        return mainActivity;
    }
    @Provides
    @ActivityScopes
    @ActivityContent
    public Context provideContext(){
        return context;
    }
}
