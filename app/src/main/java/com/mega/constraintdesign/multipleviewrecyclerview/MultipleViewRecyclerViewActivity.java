package com.mega.constraintdesign.multipleviewrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mega.constraintdesign.R;

import java.util.ArrayList;
import java.util.List;

public class MultipleViewRecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_view_recycler_view);

        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ItemClass> itemClasses = new ArrayList<>();


        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.thanos,
                "Item Type 2", "Text"));
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Item Type 2", "Text"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.thanos,
                "Item Type 2", "Text"));
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Item Type 2", "Text"));

        AdapterClass adapter
                = new AdapterClass(itemClasses);


        recyclerView.setAdapter(adapter);
    }
}