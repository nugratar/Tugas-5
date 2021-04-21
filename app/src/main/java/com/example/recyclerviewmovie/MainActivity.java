package com.example.recyclerviewmovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovies;
    private final List<Movies> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovies = findViewById(R.id.rv_movies);
        rvMovies.setHasFixedSize(true);

        list.addAll(DataSource.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter =  new ListAdapter(list);
        rvMovies.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallBack(new ListAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Movies data) {
                showSelectedMovie(data);
            }
        });
    }
    private void showSelectedMovie(Movies movies) {
//        Toast.makeText(this, "Your choose: " + movies.getName(), Toast.LENGTH_SHORT).show();
    }
}