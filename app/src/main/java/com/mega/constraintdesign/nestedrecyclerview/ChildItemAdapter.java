package com.mega.constraintdesign.nestedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mega.constraintdesign.R;

import java.util.List;

public class ChildItemAdapter extends RecyclerView.Adapter<ChildItemAdapter.ChildViewHolder> {

    private List<ChildItem> ChildItemList;

    ChildItemAdapter(List<ChildItem> childItemList)
    {
        this.ChildItemList = childItemList;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(
                        R.layout.child_item,
                        parent, false);

        return new ChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {


        ChildItem childItem = ChildItemList.get(position);

        holder.ChildItemTitle.setText(childItem.getChildItemTitle());

    }

    @Override
    public int getItemCount() {
        return ChildItemList.size();
    }

    class ChildViewHolder
            extends RecyclerView.ViewHolder {

        TextView ChildItemTitle;

        ChildViewHolder(View itemView)
        {
            super(itemView);
            ChildItemTitle
                    = itemView.findViewById(
                    R.id.child_item_title);
        }
    }
}
