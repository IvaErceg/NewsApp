package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Iva on 17.12.2016..
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);

            News currentNews = getItem(position);

            TextView titleView = (TextView) listItemView.findViewById(R.id.title_text_view);
            titleView.setText(currentNews.getTitle());

            TextView categoryView = (TextView) listItemView.findViewById(R.id.category_text_view);
            categoryView.setText(currentNews.getCategory());
        }
        return listItemView;

    }
}