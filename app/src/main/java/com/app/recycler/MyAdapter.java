package com.app.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.idTextViewNameitemView.setText(items.get(position).getIdTextViewName());
        holder.idTextTimingitemView.setText(items.get(position).getIdTextTiming());
        holder.idTextViewMsgitemView.setText(items.get(position).getIdTextViewMsg());
        holder.idTextViewContactitemView.setText(items.get(position).getIdTextViewContact());
        holder.idImageViewProitemView.setImageResource(items.get(position).getIdImageViewPro());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
