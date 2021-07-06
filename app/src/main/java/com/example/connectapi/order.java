package com.example.connectapi;

public class order {

    int PostID;
    String phone;
    String name;
    String productType;
    String amount;
    String government;
    String userType;
    String area;
    String Date;

    public order() {

    }

    public order(String phone, String name, String productType, String amount, String government, String userType, String area, String date) {
        this.phone = phone;
        this.name = name;
        this.productType = productType;
        this.amount = amount;
        this.government = government;
        this.userType = userType;
        this.area = area;
        Date = date;
    }

    public int getPostID() {
        return PostID;
    }

    public void setPostID(int postID) {
        PostID = postID;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "order{" +
                "PostID=" + PostID +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", productType='" + productType + '\'' +
                ", amount='" + amount + '\'' +
                ", government='" + government + '\'' +
                ", userType='" + userType + '\'' +
                ", area='" + area + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
