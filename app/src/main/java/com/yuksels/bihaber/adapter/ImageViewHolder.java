package com.yuksels.bihaber.adapter;

import android.view.View;

import androidx.annotation.NonNull;

import com.yuksels.bihaber.adapter.BaseViewHolder;
import com.yuksels.bihaber.databinding.ItemNewsImageBinding;
import com.yuksels.bihaber.databinding.ItemNewsTextBinding;
import com.yuksels.bihaber.model.NewsItem;

public class ImageViewHolder extends BaseViewHolder {

    ItemNewsImageBinding itemNewsImageBinding;

    public ImageViewHolder(@NonNull ItemNewsImageBinding itemNewsImageBinding) {
        super(itemNewsImageBinding.getRoot());
        this.itemNewsImageBinding = itemNewsImageBinding;
    }

    @Override
    public void bindData(NewsItem item) {
        itemNewsImageBinding.setNewsItemImage(item);
    }

    @Override
    public ItemNewsTextBinding getItemNewsTextBinding() {
        return null;
    }

    @Override
    public ItemNewsImageBinding getItemNewsImageBinding() {
        return null;
    }
}
