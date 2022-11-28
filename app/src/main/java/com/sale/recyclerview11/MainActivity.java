package com.sale.recyclerview11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recView;
    List<ModelClass> userlist;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recView = findViewById(R.id.recView);

        initDummyData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setLayoutManager(layoutManager);
        adapter = new Adapter(this,userlist);
        recView.setAdapter(adapter);
    }

    private void initDummyData() {
        userlist = new ArrayList<>();
        ModelClass modelClass;

        modelClass = new ModelClass("kishor");
        userlist.add(modelClass);

        modelClass = new ModelClass("vijay");
        userlist.add(modelClass);

        modelClass = new ModelClass("somya");
        userlist.add(modelClass);

        modelClass = new ModelClass("vishwa");
        userlist.add(modelClass);

        modelClass = new ModelClass("praveen");
        userlist.add(modelClass);

        modelClass = new ModelClass("harsh");
        userlist.add(modelClass);

        modelClass = new ModelClass("bharat");
        userlist.add(modelClass);

        modelClass = new ModelClass("zafar");
        userlist.add(modelClass);

        modelClass = new ModelClass("ramesh");
        userlist.add(modelClass);

        modelClass = new ModelClass("pawan");
        userlist.add(modelClass);

        modelClass = new ModelClass("rajat");
        userlist.add(modelClass);

        modelClass = new ModelClass("nitish");
        userlist.add(modelClass);

    }
}