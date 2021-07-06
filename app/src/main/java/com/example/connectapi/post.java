package com.example.connectapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class post {

    private String phone;
    private String otp;
    private String name;


    public post(String phone, String otp, String name) {
        this.phone = phone;
        this.otp = otp;
        this.name = name;
    }

    public post(String phone) {
        this.phone = phone;
    }

    public post(String phone,String otp) {
        this.phone = phone;
        this.otp=otp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "post{" +
                "phone='" + phone + '\'' +
                ", otp='" + otp + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}