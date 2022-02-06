package com.yogeshmt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.yogeshmt.modelclass.Productmodelclass;

import java.util.ArrayList;


public class ViewProductAdapter extends RecyclerView.Adapter<ViewProductAdapter.ViewHolder> {

    private Context context;
    ArrayList<Productmodelclass> productlist;
    public ViewProductAdapter(Context context, ArrayList<Productmodelclass> productlist) {
        this.context = context;
        this.productlist = productlist;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_product_item, parent,false);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);

        return viewHolder;
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(ViewHolder viewHolder,  int position) {
        viewHolder.img_product.setImageResource(productlist.get(position).getImage());
        viewHolder.txt_pro_name.setText(productlist.get(position).getProductName());
        viewHolder.txt_off_price.setText("MRP ₹"+productlist.get(position).getOffPrice());
        viewHolder.txt_dm_price.setText("Dmart ₹"+productlist.get(position).getDMPrice());
        viewHolder.txt_save_price.setText("Save ₹"+productlist.get(position).getSavePrice());
        viewHolder.txt_product_count.setText(productlist.get(position).getProductCount());

        viewHolder.txt_off_price.setPaintFlags(viewHolder.txt_off_price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

    }

    @Override
    public int getItemCount() {
        return productlist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        RoundRectCornerImageView img_product;
        AppCompatTextView txt_pro_name,txt_off_price,txt_dm_price,txt_save_price,txt_product_count;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            img_product = itemLayoutView.findViewById(R.id.img_product);
            txt_pro_name = itemLayoutView.findViewById(R.id.txt_pro_name);
            txt_off_price = itemLayoutView.findViewById(R.id.txt_off_price);
            txt_dm_price = itemLayoutView.findViewById(R.id.txt_dm_price);
            txt_save_price = itemLayoutView.findViewById(R.id.txt_save_price);
            txt_product_count = itemLayoutView.findViewById(R.id.txt_product_count);
        }

    }
}

