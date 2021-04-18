package com.example.listcandiesproject;

public class Candy {

    private int resourceImage;
    private String description;

    public Candy(int imageResource, String description) {
        this.resourceImage = imageResource;
        this.description = description;
    }

    public int getResourceImage() {
        return resourceImage;
    }

    public void setResourceImage(int resourceImage) {
        this.resourceImage = resourceImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
