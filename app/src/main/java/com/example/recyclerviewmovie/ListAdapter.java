package com.example.recyclerviewmovie;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private final List<Movies> listMovies;
    public ListAdapter(List<Movies> movies) {
        this.listMovies = movies;
    }

    private OnItemClickCallBack onItemClickCallBack;
    public void setOnItemClickCallBack (OnItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_movies, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Movies movies = listMovies.get(position);
        Glide.with(holder.itemView.getContext()).load(movies.getPoster()).apply(new RequestOptions().override(55, 55));
        holder.tvName.setText(movies.getName());
        holder.tvReleaseDate.setText(movies.getReleaseDate());
        holder.tvPlot.setText(movies.getPlot());
        holder.ivPoster.setImageResource(movies.getPoster());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(listMovies.get(holder.getAbsoluteAdapterPosition()));
                Intent m = new Intent(holder.itemView.getContext(), DetailActivity.class);
                m.putExtra("Name", movies.getName());
                m.putExtra("Releasedate", movies.getReleaseDate());
                m.putExtra("Plot", movies.getPlot());
                m.putExtra("Poster", movies.getPoster());

                holder.itemView.getContext().startActivity(m);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvReleaseDate;
        TextView tvPlot;
        ImageView ivPoster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvReleaseDate = itemView.findViewById(R.id.tv_releaseDate);
            tvPlot = itemView.findViewById(R.id.tv_plot);
            ivPoster = itemView.findViewById(R.id.iv_poster);
        }
    }

    public interface OnItemClickCallBack {
        void onItemClicked(Movies data);
    }
}
