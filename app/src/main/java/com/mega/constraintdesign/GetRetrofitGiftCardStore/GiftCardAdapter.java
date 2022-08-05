package com.mega.constraintdesign.GetRetrofitGiftCardStore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mega.constraintdesign.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GiftCardAdapter extends RecyclerView.Adapter<GiftCardAdapter.GiftCardViewHolder> {

    List<GiftCardModel> list;
    Context context;

    public GiftCardAdapter(List<GiftCardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public GiftCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.giftcard,parent,false);
        return new GiftCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GiftCardViewHolder holder, int position) {
        GiftCardModel giftCardModel = list.get(position);

        holder.giftCardName.setText(giftCardModel.getGiftCardName());
        holder.marketingContent01.setText(giftCardModel.getMarketingContent01());
        holder.marketingContent02.setText(giftCardModel.getMarketingContent02());
        Picasso.get().load(giftCardModel.getGiftCardImageUrl()).into(holder.giftCardImageUrl);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class GiftCardViewHolder extends RecyclerView.ViewHolder{

        ImageView giftCardImageUrl;
        TextView marketingContent01,giftCardName,marketingContent02;
        public GiftCardViewHolder(@NonNull View itemView) {
            super(itemView);
            giftCardImageUrl=itemView.findViewById(R.id.gift_card_img_url);
            marketingContent01=itemView.findViewById(R.id.market_content_one);
            marketingContent02=itemView.findViewById(R.id.marketing_content_two);
            giftCardName=itemView.findViewById(R.id.gift_card_name);
        }
    }
}
