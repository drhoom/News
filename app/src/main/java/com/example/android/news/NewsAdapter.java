package com.example.android.news;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = convertView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitle());

        TextView authorView = convertView.findViewById(R.id.author);
        authorView.setText(currentNews.getAuthor());

        TextView datePublishedView = convertView.findViewById(R.id.date_published);
        datePublishedView.setText(currentNews.getDatePublished());

        TextView sectionView = convertView.findViewById(R.id.section);
        sectionView.setText(currentNews.getSection());

        return convertView;
    }
}