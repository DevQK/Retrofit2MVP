package khanh.retrofit2mvp.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import khanh.retrofit2mvp.Model.Products;
import khanh.retrofit2mvp.R;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductHolder> {
    private List<Products> dt;
    private Context ct;

    public ProductsAdapter(List<Products> dt, Context ct) {
        this.dt = dt;
        this.ct = ct;
    }

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.itemrecyclerview, parent, false);
        return new ProductHolder(v);
    }

    @Override
    public void onBindViewHolder(ProductHolder holder, int position) {
        Products pd = dt.get(position);
        holder.tvName.setText(pd.getProductName());
        Glide.with(ct).load(pd.getThumnail()).centerCrop().into(holder.imgThunail);
    }

    @Override
    public int getItemCount() {
        return dt.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.img_Thumnail)
        ImageView imgThunail;
        @BindView(R.id.tv_Name)
        TextView tvName;
        public ProductHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
