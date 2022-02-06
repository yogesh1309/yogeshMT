package com.yogeshmt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.yogeshmt.modelclass.Productmodelclass;
import com.yogeshmt.modelclass.ViewCategorymodelclass;

import java.util.ArrayList;


public class ViewCategoryAdapter extends RecyclerView.Adapter<ViewCategoryAdapter.ViewHolder> {

    private Context context;
    ArrayList<ViewCategorymodelclass> productlist;
    public ViewCategoryAdapter(Context context, ArrayList<ViewCategorymodelclass> productlist) {
        this.context = context;
        this.productlist = productlist;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_category_item, parent,false);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);

        return viewHolder;
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(ViewHolder viewHolder,  int position) {
        viewHolder.img_cate.setImageResource(productlist.get(position).getImage());
        viewHolder.txt_name.setText(productlist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return productlist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        AppCompatImageView img_cate;
        AppCompatTextView txt_name;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            img_cate = itemLayoutView.findViewById(R.id.img_cate);
            txt_name = itemLayoutView.findViewById(R.id.txt_name);
        }

    }
}

