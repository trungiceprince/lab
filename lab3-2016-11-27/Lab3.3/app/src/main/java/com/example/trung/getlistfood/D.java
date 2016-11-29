package com.example.trung.getlistfood;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by trung on 11/27/2016.
 */

public class D {
    @SerializedName("Description")
    String DescriptionHair;
    @SerializedName("Id")
    int IdHair;
    @SerializedName("Images")
    List<Images> ImagesHair;
    @SerializedName("Title")
    String TitleHair;

    public D(String descriptionHair, int idHair, List<Images> imagesHair, String titleHair) {
        DescriptionHair = descriptionHair;
        IdHair = idHair;
        ImagesHair = imagesHair;
        TitleHair = titleHair;
    }

    public List<Images> getImagesHair() {
        return ImagesHair;
    }

    public String getDescriptionHair() {
        return DescriptionHair;
    }

    public int getIdHair() {
        return IdHair;
    }

    public String getTitleHair() {
        return TitleHair;
    }

    @Override
    public String toString() {
        return "D{" +
                "DescriptionHair='" + DescriptionHair + '\'' +
                ", IdHair=" + IdHair +
                ", ImagesHair=" + ImagesHair +
                ", TitleHair='" + TitleHair + '\'' +
                '}'+ "\n";
    }
}
