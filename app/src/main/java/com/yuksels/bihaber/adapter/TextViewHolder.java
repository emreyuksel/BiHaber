package com.yuksels.bihaber.adapter;

import androidx.annotation.NonNull;

import com.yuksels.bihaber.databinding.ItemNewsImageBinding;
import com.yuksels.bihaber.databinding.ItemNewsTextBinding;
import com.yuksels.bihaber.model.NewsItem;

public class TextViewHolder extends BaseViewHolder {

    ItemNewsTextBinding itemNewsTextBinding;

    public TextViewHolder(@NonNull ItemNewsTextBinding itemNewsTextBinding) {
        super(itemNewsTextBinding.getRoot());
        this.itemNewsTextBinding = itemNewsTextBinding;
    }

    @Override
    public void bindData(NewsItem item) {
        itemNewsTextBinding.setNewsItemText(item);
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
