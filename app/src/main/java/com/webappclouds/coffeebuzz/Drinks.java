package com.webappclouds.coffeebuzz;

public class Drinks {
    private String name;
    private String desc;
    private int imageID;

    public static final Drinks[] drinks = {
            new Drinks("Latte","this is a latte",R.drawable.latte),
            new Drinks("Cappuccino","this is a cappuccino",R.drawable.cap),
            new Drinks("Filter","this is a filter coffee",R.drawable.beans)

    };

    private Drinks(String name, String desc, int imageID){
        this.name = name;
        this.desc = desc;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String toString(){
        return name;
    }
}
