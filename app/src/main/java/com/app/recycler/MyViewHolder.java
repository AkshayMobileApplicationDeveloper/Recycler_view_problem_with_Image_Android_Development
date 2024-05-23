package com.app.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView idImageViewProitemView;
    TextView idTextViewNameitemView;
    TextView idTextViewContactitemView;
    TextView idTextViewMsgitemView;
    TextView idTextTimingitemView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        idImageViewProitemView = itemView.findViewById(R.id.idImageViewPro);
        idTextViewNameitemView = itemView.findViewById(R.id.idTextViewName);
        idTextViewContactitemView = itemView.findViewById(R.id.idTextViewContact);
        idTextViewMsgitemView = itemView.findViewById(R.id.idTextViewMsg);
        idTextTimingitemView = itemView.findViewById(R.id.idTextTiming);
    }
}
