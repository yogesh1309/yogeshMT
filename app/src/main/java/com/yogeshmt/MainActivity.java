package com.yogeshmt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.yogeshmt.modelclass.Productmodelclass;
import com.yogeshmt.modelclass.ViewCategorymodelclass;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    Context context;
    @BindView(R.id.img_viewPager)
    ViewPager img_viewPager;
    @BindView(R.id.rec_productlist)
    RecyclerView rec_productlist;
    @BindView(R.id.rec_catelist)
    RecyclerView rec_catelist;
    ViewProductAdapter viewProductAdapter;
    ViewCategoryAdapter viewCategoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        BannerDataSet();
        ProductListDataSet();
        CategoryListDataSet();
    }

    private void CategoryListDataSet() {
        ArrayList<ViewCategorymodelclass> categorylist = new ArrayList<>();
        ViewCategorymodelclass category1 = new ViewCategorymodelclass(R.drawable.img_pro1, "DMart Grocery");
        ViewCategorymodelclass category2 = new ViewCategorymodelclass(R.drawable.img_pro2, "Grocery");
        ViewCategorymodelclass category3 = new ViewCategorymodelclass(R.drawable.img1_banner, "Dairy & Beverages");
        ViewCategorymodelclass category4 = new ViewCategorymodelclass(R.drawable.img2_banner, "Package Food");
        ViewCategorymodelclass category5 = new ViewCategorymodelclass(R.drawable.img3_banner, "Home & Kitchen");
        ViewCategorymodelclass category6 = new ViewCategorymodelclass(R.drawable.img4_banner, "Personal Care");
        ViewCategorymodelclass category7 = new ViewCategorymodelclass(R.drawable.img_pro1, "Baby & Kids");
        ViewCategorymodelclass category8 = new ViewCategorymodelclass(R.drawable.img_pro2, "Applications");
        ViewCategorymodelclass category9 = new ViewCategorymodelclass(R.drawable.img1_banner, "Footware");
        categorylist.add(category1);
        categorylist.add(category2);
        categorylist.add(category3);
        categorylist.add(category4);
        categorylist.add(category5);
        categorylist.add(category6);
        categorylist.add(category7);
        categorylist.add(category8);
        categorylist.add(category9);
        rec_catelist.setLayoutManager(new GridLayoutManager(context,3));
        rec_catelist.setHasFixedSize(true);
        viewCategoryAdapter = new ViewCategoryAdapter(context, categorylist);
        rec_catelist.setAdapter(viewCategoryAdapter);
    }

    private void ProductListDataSet() {
        ArrayList<Productmodelclass> productlist = new ArrayList<>();
        Productmodelclass productmodelclass1 = new Productmodelclass(R.drawable.img_pro1, "Fortune Sunlite Refined Sunflower Oil : 1 Litre", "137.00", "105.00", "32.00", "1 L");
        Productmodelclass productmodelclass2 = new Productmodelclass(R.drawable.img_pro2, "Premia Green Elaichi Economy : 10 gms", "50.00", "48.00", "2.00", "10 gm");
        productlist.add(productmodelclass1);
        productlist.add(productmodelclass2);
        rec_productlist.setLayoutManager(new LinearLayoutManager(context));
        rec_productlist.setHasFixedSize(true);
        viewProductAdapter = new ViewProductAdapter(context, productlist);
        rec_productlist.setAdapter(viewProductAdapter);
    }

    private void BannerDataSet() {
        try {
            ArrayList<Integer> banner_image_list = new ArrayList<>();
            banner_image_list.add(R.drawable.img1_banner);
            banner_image_list.add(R.drawable.img2_banner);
            banner_image_list.add(R.drawable.img3_banner);
            banner_image_list.add(R.drawable.img4_banner);
            img_viewPager.setAdapter(new Banneradapter(context, img_viewPager, banner_image_list));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void InitView() {
        ButterKnife.bind(this);
        context = MainActivity.this;
    }
}