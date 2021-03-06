package com.ty.fragmentbestpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ty.fragmentbestpractice.R;
import com.ty.fragmentbestpractice.pojo.News;

import java.util.List;

/**
 * Created by Tony on 2015/5/29.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    private int resourceId;

    public NewsAdapter(Context context, int textViewResourceId, List<News> objects) {
        super(context, textViewResourceId, objects);
        this.resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        } else {
            view = convertView;
        }
        TextView newsTitleText = (TextView)view.findViewById(R.id.news_title);
        newsTitleText.setText(news.getTitle());

        return view;
    }
}
