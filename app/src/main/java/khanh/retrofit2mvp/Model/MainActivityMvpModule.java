package khanh.retrofit2mvp.Model;

import dagger.Module;
import dagger.Provides;
import khanh.retrofit2mvp.View.Contract.MainActivityContract;
import khanh.retrofit2mvp.View.Scopes.ActivityScopes;
@Module
public class MainActivityMvpModule {
    private final MainActivityContract.View mView;
    public MainActivityMvpModule(MainActivityContract.View mView){
        this.mView = mView;
    }
    @Provides
    @ActivityScopes
    public MainActivityContract.View provideView(){
        return mView;
    }
}
