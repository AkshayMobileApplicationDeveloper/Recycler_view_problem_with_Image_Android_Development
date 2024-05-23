package com.app.recycler.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.recycler.Item;
import com.app.recycler.R;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    Context context;
    ArrayList<Item> arrayList;

    public ChatAdapter(Context context, ArrayList<Item> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_view,parent,false);
        return new ChatAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder holder, int position) {
        holder.idImageViewProitemView.setImageResource(arrayList.get(position).getIdImageViewPro());
        holder.idTextViewNameitemView.setText(arrayList.get(position).getIdTextViewName());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView idImageViewProitemView;
        TextView idTextViewNameitemView;
        TextView idTextViewContactitemView;
        TextView idTextViewMsgitemView;
        TextView idTextTimingitemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idImageViewProitemView = itemView.findViewById(R.id.idImageViewPro);
            idTextViewNameitemView = itemView.findViewById(R.id.idTextViewName);
            idTextViewContactitemView = itemView.findViewById(R.id.idTextViewContact);
            idTextViewMsgitemView = itemView.findViewById(R.id.idTextViewMsg);
            idTextTimingitemView = itemView.findViewById(R.id.idTextTiming);
        }
    }
}
