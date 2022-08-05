package com.mega.constraintdesign.nestedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mega.constraintdesign.R;

import java.util.List;

public class ParentItemAdapter extends RecyclerView.Adapter<ParentItemAdapter.parentItemViewHolder> {

    private RecyclerView.RecycledViewPool
            viewPool
            = new RecyclerView
            .RecycledViewPool();
    private List<ParentItem> itemList;

    public ParentItemAdapter(List<ParentItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public parentItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(
                        R.layout.parent_item,
                        parent, false);

        return new parentItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull parentItemViewHolder holder, int position) {

        ParentItem parentItem
                = itemList.get(position);

        // For the created instance,
        // get the title and set it
        // as the text for the TextView


        // Create a layout manager
        // to assign a layout
        // to the RecyclerView.

        // Here we have assigned the layout
        // as LinearLayout with vertical orientation
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(
                holder
                        .ChildRecyclerView
                        .getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);

        // Since this is a nested layout, so
        // to define how many child items
        // should be prefetched when the
        // child RecyclerView is nested
        // inside the parent RecyclerView,
        // we use the following method
        layoutManager
                .setInitialPrefetchItemCount(
                        parentItem
                                .getChildItemList()
                                .size());

        // Create an instance of the child
        // item view adapter and set its
        // adapter, layout manager and RecyclerViewPool
        ChildItemAdapter childItemAdapter
                = new ChildItemAdapter(
                parentItem
                        .getChildItemList());
       holder
                .ChildRecyclerView
                .setLayoutManager(layoutManager);
       holder
                .ChildRecyclerView
                .setAdapter(childItemAdapter);
       holder
                .ChildRecyclerView
                .setRecycledViewPool(viewPool);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    class parentItemViewHolder
            extends RecyclerView.ViewHolder {

        RecyclerView ChildRecyclerView;

        parentItemViewHolder(final View itemView)
        {
            super(itemView);


            ChildRecyclerView = itemView
                    .findViewById(
                            R.id.child_recyclerview);
        }
    }
}
