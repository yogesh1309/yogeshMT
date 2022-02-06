package com.yogeshmt.modelclass;

import java.io.Serializable;

public class Productmodelclass implements Serializable {
    public int image;
    public String ProductName;
    public String OffPrice;
    public String DMPrice;
    public String SavePrice;
    public String ProductCount;

    public Productmodelclass(int image, String productName, String offPrice, String DMPrice, String savePrice, String productCount) {
        this.image = image;
        ProductName = productName;
        OffPrice = offPrice;
        this.DMPrice = DMPrice;
        SavePrice = savePrice;
        ProductCount = productCount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getOffPrice() {
        return OffPrice;
    }

    public void setOffPrice(String offPrice) {
        OffPrice = offPrice;
    }

    public String getDMPrice() {
        return DMPrice;
    }

    public void setDMPrice(String DMPrice) {
        this.DMPrice = DMPrice;
    }

    public String getSavePrice() {
        return SavePrice;
    }

    public void setSavePrice(String savePrice) {
        SavePrice = savePrice;
    }

    public String getProductCount() {
        return ProductCount;
    }

    public void setProductCount(String productCount) {
        ProductCount = productCount;
    }
}
