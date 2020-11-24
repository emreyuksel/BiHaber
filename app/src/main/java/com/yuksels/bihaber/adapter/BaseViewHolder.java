package com.yuksels.bihaber.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yuksels.bihaber.databinding.ItemNewsImageBinding;
import com.yuksels.bihaber.databinding.ItemNewsTextBinding;
import com.yuksels.bihaber.model.NewsItem;

abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public abstract void bindData(NewsItem item);

    public abstract ItemNewsTextBinding getItemNewsTextBinding();
    public abstract ItemNewsImageBinding getItemNewsImageBinding();

}
