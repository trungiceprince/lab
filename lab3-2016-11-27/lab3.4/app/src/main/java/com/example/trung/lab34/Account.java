package com.example.trung.lab34;

import com.google.gson.annotations.SerializedName;

/**
 * Created by trung on 11/29/2016.
 */

public class Account {
    @SerializedName("YearOfBirth") int yearOfBirth;
    @SerializedName("Phone") String phone;
    @SerializedName("AccessToken") String accessToken;
    @SerializedName("Id") int id;
    @SerializedName("CustomerName") String customerName;
    @SerializedName("Email") String email;
    @SerializedName("DayOfBirth") int dayOfBirth;
    @SerializedName("MonthOfBirth") int monthOfBirth;

    public Account(int yearOfBirth, String phone, String accessToken, int id, String customerName, String email, int dayOfBirth, int monthOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.phone = phone;
        this.accessToken = accessToken;
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    @Override
    public String toString() {
        return "Account{" +
                "yearOfBirth=" + yearOfBirth +
                ", phone='" + phone + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", id=" + id +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                '}';
    }
}
