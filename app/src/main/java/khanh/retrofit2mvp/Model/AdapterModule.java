package khanh.retrofit2mvp.Model;

import dagger.Module;
import dagger.Provides;
import khanh.retrofit2mvp.MainActivity;
import khanh.retrofit2mvp.View.MainView.RecyclerViewAdapter;
import khanh.retrofit2mvp.View.Scopes.ActivityScopes;

@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {
    @Provides
    @ActivityScopes
    public RecyclerViewAdapter getCoinList(RecyclerViewAdapter.ClickListener clickListener){
        return new RecyclerViewAdapter(clickListener);
    }
    @Provides
    @ActivityScopes
    public RecyclerViewAdapter.ClickListener getClickListener(MainActivity mainActivity){
        return mainActivity;
    }
}
