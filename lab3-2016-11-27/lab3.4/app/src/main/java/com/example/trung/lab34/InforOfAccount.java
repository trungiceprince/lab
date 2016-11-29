package com.example.trung.lab34;

import com.google.gson.annotations.SerializedName;

/**
 * Created by trung on 11/29/2016.
 */

public class InforOfAccount {
    @SerializedName("d") Account account;

    public InforOfAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "InforOfAccount{" +
                "account=" + account +
                '}';
    }
}
