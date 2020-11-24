package com.yuksels.bihaber.adapter;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.yuksels.bihaber.R;
import com.yuksels.bihaber.databinding.ItemNewsImageBinding;
import com.yuksels.bihaber.databinding.ItemNewsTextBinding;
import com.yuksels.bihaber.model.NewsItem;

public class NewsListAdapter extends ListAdapter<NewsItem, BaseViewHolder> {

    OnNewsItemClickEvent listener;
    public static final int VIEWTYPE_NEWS_TEXT = 0;
    public static final int VIEWTYPE_NEWS_IMAGE = 1;
    public static final int VIEWTYPE_NEWS_VIDEO = 2;


    public interface OnNewsItemClickEvent {
        void onItemTextClick();

        void onItemImageClick();

        void onItemLongClick();

    }

    public void setOnNewsItemClickListener(OnNewsItemClickEvent listener) {
        this.listener = listener;
    }

    public NewsListAdapter(@NonNull DiffUtil.ItemCallback<NewsItem> diffCallback) {
        super(diffCallback);
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEWTYPE_NEWS_TEXT:
                ItemNewsTextBinding itemNewsTextBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_news_text, parent, false);
                return  new TextViewHolder(itemNewsTextBinding);
            case VIEWTYPE_NEWS_IMAGE:
                ItemNewsImageBinding itemNewsImageBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_news_image, parent, false);
                return  new ImageViewHolder(itemNewsImageBinding);
            default:
                ItemNewsTextBinding defaultItemNewsTextBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_news_text, parent, false);
                return  new TextViewHolder(defaultItemNewsTextBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
            holder.bindData(getItem(position));
    }
}
