package com.example.saisankar.moviedb.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saisankar.moviedb.R;
import com.example.saisankar.moviedb.model.ReviewsInfo;

import java.util.ArrayList;

/**
 * Created by Sai Sankar on 18-05-2018.
 */

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder> {
    Context c;
    ArrayList<ReviewsInfo> infos;

    public ReviewsAdapter(Context context, ArrayList<ReviewsInfo> reviewslist) {
        this.c = context;
        this.infos = reviewslist;
    }

    @Override
    public ReviewsAdapter.ReviewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.reviewsdesign, parent, false);
        return new ReviewsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ReviewsAdapter.ReviewsViewHolder holder, int position) {
        ReviewsInfo reviewsInfo = infos.get(position);
        holder.auther.setText(reviewsInfo.getAuther());
        holder.review.setText(reviewsInfo.getContent());
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }

    public class ReviewsViewHolder extends RecyclerView.ViewHolder {
        TextView auther, review;

        public ReviewsViewHolder(View itemView) {
            super(itemView);
            auther = itemView.findViewById(R.id.auther);
            review = itemView.findViewById(R.id.review);
        }
    }
}