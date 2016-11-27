package com.example.trung.getrepositories.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by trung on 11/27/2016.
 */

public class Repositorie {
    @SerializedName("name")
    private String nameUser;
    @SerializedName("owner")
    private Owner ownerUser;

    public Repositorie(String nameUser, Owner ownerUser) {
        this.nameUser = nameUser;
        this.ownerUser = ownerUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Owner getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(Owner ownerUser) {
        this.ownerUser = ownerUser;
    }
}
