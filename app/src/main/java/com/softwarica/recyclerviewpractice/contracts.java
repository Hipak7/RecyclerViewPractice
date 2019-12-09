package com.softwarica.recyclerviewpractice;

public class contracts {
    private String name;
    private String message;
    private String time;
    private int imageId;

    public contracts(String name, String message, String time,int imageId) {
        this.name = name;
        this.message = message;
        this.time=time;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
