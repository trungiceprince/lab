package com.example.trung.getlistfood;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by trung on 11/27/2016.
 */

public class D {
    @SerializedName("Fanpage")
    String FanpageSalon;
    @SerializedName("Name")
    String NameSalon;
    @SerializedName("FanpageId")
    String FanpageIdSalon;
    @SerializedName("ManagerName")
    String ManagerNameSalon;
    @SerializedName("Phone")
    String phoneSalon;
    @SerializedName("Images")
    List<Images> ImagesSalon;
    @SerializedName("Id")
    int IdSalon;

    public D(String fanpageSalon, String nameSalon, String fanpageIdSalon, String managerNameSalon, String phoneSalon, List<Images> imagesSalon, int idSalon) {
        FanpageSalon = fanpageSalon;
        NameSalon = nameSalon;
        FanpageIdSalon = fanpageIdSalon;
        ManagerNameSalon = managerNameSalon;
        this.phoneSalon = phoneSalon;
        ImagesSalon = imagesSalon;
        IdSalon = idSalon;
    }

    @Override
    public String toString() {
        return "D{" +
                "FanpageSalon='" + FanpageSalon + '\'' +
                ", NameSalon='" + NameSalon + '\'' +
                ", FanpageIdSalon=" + FanpageIdSalon +
                ", ManagerNameSalon='" + ManagerNameSalon + '\'' +
                ", phoneSalon=" + phoneSalon +
                ", ImagesSalon=" + ImagesSalon +
                ", IdSalon=" + IdSalon +
                '}'+ "\n";
    }
}
