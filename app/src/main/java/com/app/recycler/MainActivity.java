package com.app.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Item> items=new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView=findViewById(R.id.idRecyclerView);


        items.add(new Item(R.drawable.il,"Akshay kumar","8521616730","okay ...","2:40 AM"));
        items.add(new Item(R.drawable.poja,"Pooja Singh","7562864554","Be Friend\n I can never ","9:10 AM"));
        items.add(new Item(R.drawable.neha,"Neha help me","8987880672","Use Color Red","2:10 PM"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}