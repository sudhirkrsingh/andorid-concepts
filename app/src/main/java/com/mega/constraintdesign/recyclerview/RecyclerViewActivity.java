package com.mega.constraintdesign.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mega.constraintdesign.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ExamAdapter examAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView=findViewById(R.id.recyclerView);

        List<ExamData> list;
        list=getData();
        examAdapter=new ExamAdapter(list,getApplication());
        recyclerView.setAdapter(examAdapter);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
    }
    // Sample data for RecyclerView
    private List<ExamData> getData()
    {
        List<ExamData> list = new ArrayList<>();
        list.add(new ExamData("First Exam",
                "May 23, 2015",
                "Best Of Luck"));
        list.add(new ExamData("Second Exam",
                "June 09, 2015",
                "b of l"));
        list.add(new ExamData("My Test Exam",
                "April 27, 2017",
                "This is testing exam .."));

        return list;
    }
}