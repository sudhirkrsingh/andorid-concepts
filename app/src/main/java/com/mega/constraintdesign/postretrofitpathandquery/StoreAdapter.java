package com.mega.constraintdesign.postretrofitpathandquery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mega.constraintdesign.databinding.SinglemallBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.StoreViewHolder> {

    Context context;
    List<StoreSingleModel> list;


    public StoreAdapter(Context context, List<StoreSingleModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public StoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SinglemallBinding binding= SinglemallBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new  StoreViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreViewHolder holder, int position) {
        StoreSingleModel storeSingleModel = list.get(position);
        holder.brandName.setText(storeSingleModel.getBrandName());
        holder.brandLoc.setText(storeSingleModel.getStoreAddress());

        if( !storeSingleModel.getStoreImages().isEmpty()){
            Picasso.get().load(storeSingleModel.getStoreImages().get(0)).into(holder.brandImg);
        }
        else {
            Picasso.get().load(storeSingleModel.getStoreImageUrl()).into(holder.brandImg);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class StoreViewHolder
            extends RecyclerView.ViewHolder {

        TextView brandName;
        TextView brandLoc;
        ImageView brandImg;

        StoreViewHolder(SinglemallBinding binding)
        {
            super(binding.getRoot());
            brandImg=binding.brandImg;
            brandName=binding.brandName;
            brandLoc=binding.brandLoc;

        }
    }
}
