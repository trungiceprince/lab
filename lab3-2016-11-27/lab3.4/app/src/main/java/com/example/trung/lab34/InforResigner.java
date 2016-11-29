package com.example.trung.lab34;

import com.google.gson.annotations.SerializedName;

/**
 * Created by trung on 11/29/2016.
 */

public class InforResigner {
    @SerializedName("Phone") int phone;
    @SerializedName("CustomerName") String customerName;
    @SerializedName("Email") String email;
    @SerializedName("Password") String password;
    @SerializedName("DayOfBirth") int day;
    @SerializedName("MonthOfBirth") int month;
    @SerializedName("YearOfBirth") int year;

    public InforResigner(int phone, String customerName, String email, String password, int day, int month, int year) {
        this.phone = phone;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "InforResigner{" +
                "phone=" + phone +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
