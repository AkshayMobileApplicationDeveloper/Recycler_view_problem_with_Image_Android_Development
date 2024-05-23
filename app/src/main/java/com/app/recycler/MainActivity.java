package com.app.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
//    List<Item> items=new ArrayList<Item>();
    ArrayList<Item> Arrchat=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView=findViewById(R.id.idRecyclerView);


//        items.add(new Item(R.drawable.il,"Akshay kumar","8521616730","okay ...","2:40 AM"));
//        items.add(new Item(R.drawable.poja,"Pooja Singh","7562864554","Be Friend\n I can never ","9:10 AM"));
//        items.add(new Item(R.drawable.neha,"Neha help me","8987880672","Use Color Red","2:10 PM"));


        Arrchat.add(new Item(R.drawable.il,"Akshay kumar","8521616730","okay ...","2:40 AM"));
        Arrchat.add(new Item(R.drawable.poja,"Pooja Singh","7562864554","Be Friend\n I can never ","9:10 AM"));
        Arrchat.add(new Item(R.drawable.neha,"Neha help me","8987880672","Use Color Red","2:10 PM"));

        /****
         *  recyclerView.setLayoutManager(new LinearLayoutManager(this));
         *  recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
         */

        /**
         recyclerView.setLayoutManager(new GridLayoutManager(getApplication(),0,LinearLayoutManager.HORIZONTAL,false));
         */

        // Create a GridLayoutManager with 1 column and horizontal orientation
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);

        // Set the layout manager for your RecyclerView
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),Arrchat));

    }
}