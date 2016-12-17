package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);

            News currentNews = getItem(position);

            TextView titleView = (TextView) convertView.findViewById(R.id.title_text_view);
            titleView.setText(currentNews.getTitle());

            TextView categoryView = (TextView) convertView.findViewById(R.id.category_text_view);
            categoryView.setText(currentNews.getCategory());
        }
        return convertView;

    }
}