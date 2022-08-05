package com.mega.constraintdesign.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mega.constraintdesign.R;

import java.util.List;

public class ExamAdapter extends RecyclerView.Adapter<ExamAdapter.examViewHolder> {

    List<ExamData> list;
    Context context;

    public ExamAdapter(List<ExamData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public examViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);


        View photoView
                = inflater
                .inflate(R.layout.exam_card,
                        parent, false);

        examViewHolder viewHolder
                = new examViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull examViewHolder holder, int position) {

        holder.examName
                .setText(list.get(position).name);
        holder.examDate
                .setText(list.get(position).date);
        holder.examMessage
                .setText(list.get(position).message);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class examViewHolder
            extends RecyclerView.ViewHolder {
        TextView examName;
        TextView examMessage;
        TextView examDate;
        View view;

        examViewHolder(View itemView)
        {
            super(itemView);
            examName
                    = (TextView)itemView
                    .findViewById(R.id.examName);
            examDate
                    = (TextView)itemView
                    .findViewById(R.id.examDate);
            examMessage
                    = (TextView)itemView
                    .findViewById(R.id.examMessage);

        }
    }
}
