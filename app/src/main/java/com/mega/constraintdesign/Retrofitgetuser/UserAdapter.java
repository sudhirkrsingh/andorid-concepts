package com.mega.constraintdesign.Retrofitgetuser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mega.constraintdesign.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    Context context;
    List<UserModel> list;

    public UserAdapter(Context context, List<UserModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_model,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        UserModel userModel = list.get(position);
        holder.userId.setText(String.valueOf(userModel.getUserId()));
        holder.title.setText(userModel.getUserTitle());
        holder.body.setText(userModel.getUserBody());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        TextView userId;
        TextView title;
        TextView body;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            userId=itemView.findViewById(R.id.user_id);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);

        }
    }
}
