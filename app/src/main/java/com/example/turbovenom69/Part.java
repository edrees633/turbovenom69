package com.example.turbovenom69;

import java.io.Serializable;

public class Part implements Serializable {
    private String Brand;
    private String Modelyear;
    private String description;
    private PartCat category;

    private String photo;

    public Part(String brand, String modelyear, String description, PartCat category, String photo) {
        Brand = brand;
        Modelyear = modelyear;
        this.description = description;
        this.category = category;
        this.photo = photo;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModelyear() {
        return Modelyear;
    }

    public void setModelyear(String modelyear) {
        Modelyear = modelyear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PartCat getCategory() {
        return category;
    }

    public void setCategory(PartCat category) {
        this.category = category;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Part{" +
                "Brand='" + Brand + '\'' +
                ", Modelyear='" + Modelyear + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", photo='" + photo + '\'' +
                '}';
    }
}
