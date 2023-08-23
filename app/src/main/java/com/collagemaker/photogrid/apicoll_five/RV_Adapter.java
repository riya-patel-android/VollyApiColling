package com.collagemaker.photogrid.apicoll_five;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RV_Adapter extends RecyclerView.Adapter<RV_Adapter.MyClass> {

    Context context;
    List<ModelClass> modelClasses;

    public RV_Adapter(Context context, List<ModelClass> modelClasses) {
        this.context = context;
        this.modelClasses = modelClasses;
    }

    @NonNull
    @Override
    public RV_Adapter.MyClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyClass holder = new MyClass(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RV_Adapter.MyClass holder, int position) {

        holder.title.setText(modelClasses.get(position).getTitle());
        holder.body.setText(modelClasses.get(position).getBody());
        holder.userId.setText(""+modelClasses.get(position).getUserId());
        holder.it.setText(""+modelClasses.get(position).getId());

    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }

    public class MyClass extends RecyclerView.ViewHolder {
        TextView userId;
        TextView it;
        TextView title;
        TextView body;

        public MyClass(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.userId);
            it = itemView.findViewById(R.id.it);
            title = itemView.findViewById(R.id.title);
            body = itemView.findViewById(R.id.body);
        }
    }
}

