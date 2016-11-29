package com.example.trung.getlistfood;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by trung on 11/27/2016.
 */

public class FatherSalon {
   @SerializedName("d")
    private D[] d;

    public FatherSalon(D[] d) {
        this.d = d;
    }

    public D[] getD() {
        return d;
    }

    public void setD(D[] d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "FatherSalon{" +
                "d=" + d +
                '}';
    }
}
