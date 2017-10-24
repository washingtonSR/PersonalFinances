package com.example.razzorowa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.razzorowa.myapplication.Adapters.CategoryAdapter;
import com.example.razzorowa.myapplication.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CategoryAdapter adapter;
    List<Category> itens;
    RecyclerView mListItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        // data to populate the RecyclerView
        itens = new ArrayList<Category>();
        Category a = new Category("casa", R.drawable.ic_home_black_48px);
        Category b = new Category("combustivel", R.drawable.ic_local_gas_station_black_48px);
        Category c = new Category("agua", R.drawable.ic_water_drop_black_48px);
        Category d = new Category("hospital", R.drawable.ic_local_hospital_black_48px);
        Category e = new Category("academia", R.drawable.ic_fitness_center_black_48px);
        Category f = new Category("academia", R.drawable.ic_restaurant_black_48px);
        Category g = new Category("academia", R.drawable.ic_phone_black_48px);
        itens.add(a);
        itens.add(b);
        itens.add(c);
        itens.add(d);
        itens.add(e);
        itens.add(f);
        itens.add(g);
        // Start the RecyclerView
        adapter = new CategoryAdapter(MainActivity.this, itens);
        //recycleStart();

        int numberOfColumns = 3;
        mListItens.setLayoutManager( new GridLayoutManager(this, numberOfColumns));

        mListItens.setAdapter(adapter);
    }

    public void recycleStart() {

    }

    private void bindViews() {
        mListItens = (RecyclerView) findViewById(R.id.recicler_view);
    }
}
