package com.marcoscg.fabscrollanimationsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Marcos on 27/03/2016.
 */
public class FloatFAB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        String[] data = new String[100];
        for (int i=0; i < data.length; i++)
            data[i] = "Item " + i;

        RVAdapter adapter = new RVAdapter(this, data);
        recyclerView.setAdapter(adapter);
    }
}
