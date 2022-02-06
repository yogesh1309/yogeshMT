package com.yogeshmt.modelclass;

import java.io.Serializable;

public class ViewCategorymodelclass implements Serializable {
    public int image;
    public String name;

    public ViewCategorymodelclass(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
