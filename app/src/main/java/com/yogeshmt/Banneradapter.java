package com.yogeshmt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Banneradapter extends PagerAdapter {

    private final LayoutInflater inflater;

    Context context;
    ViewPager viewPager;
    ArrayList<Integer> banner_image_list;
    public Banneradapter(Context context, ViewPager viewPager, ArrayList<Integer> banner_image_list) {
        this.context = context;
        this.viewPager = viewPager;
        this.banner_image_list = banner_image_list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return banner_image_list == null ? 0 : banner_image_list.size();

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, int position) {
        View imageLayout = inflater.inflate(R.layout.dialog_banner_list, container, false);

        if (imageLayout != null)
        {

            RoundRectCornerImageView imageView = imageLayout.findViewById(R.id.img_banner);
            imageView.setImageResource(banner_image_list.get(position));

            container.addView(imageLayout, 0);
        }
        return imageLayout;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
