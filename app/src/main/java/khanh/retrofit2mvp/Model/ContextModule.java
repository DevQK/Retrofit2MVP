package khanh.retrofit2mvp.Model;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import khanh.retrofit2mvp.View.Qualifier.ApplicationContent;
import khanh.retrofit2mvp.View.Scopes.ApplicationScopes;
@Module
public class ContextModule {
    private Context ct;

    public ContextModule(Context ct) {
        this.ct = ct;
    }
    @Provides
    @ApplicationScopes
    @ApplicationContent
    public Context provideContext(){
        return ct;
    }
}
