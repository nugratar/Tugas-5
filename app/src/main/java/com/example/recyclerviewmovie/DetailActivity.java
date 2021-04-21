package com.example.recyclerviewmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvReleaseDate;
    private TextView tvPlot;
    private ImageView ivPoster;

    String name;
    String releaseDate;
    String plot;
    int poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.tv_name);
        tvReleaseDate = findViewById(R.id.tv_releaseDate);
        tvPlot = findViewById(R.id.tv_plot);
        ivPoster = findViewById(R.id.iv_poster);

        name = getIntent().getStringExtra("Name");
        releaseDate = getIntent().getStringExtra("Releasedate");
        plot = getIntent().getStringExtra("Plot");
        poster = getIntent().getIntExtra("Poster", 0);

        tvName.setText(name);
        tvReleaseDate.setText(releaseDate);
        tvPlot.setText(plot);
        ivPoster.setImageResource(poster);
    }
}