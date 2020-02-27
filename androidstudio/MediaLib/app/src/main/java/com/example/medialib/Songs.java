package com.example.medialib;

public class Songs {

    private String title;
    private int rating;
    private double price;
    private int totalRatings;

    public Songs(){
        title = "";
        rating = 0;
        price = 0.0;
        totalRatings = 0;
    }
    public Songs(String title, double price, int rating){
        this.title = title;
        this.price = price;
        this.rating = rating;

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
}
