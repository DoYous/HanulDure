package com.hanuldure.project.model.dto;

public class firstpageDTO {

    private String name;
    private String locate;
    private int price;
    private int min;
    private int max;
    private String imgurl;

    public firstpageDTO() {
    }

    public firstpageDTO(String name, String locate, int price, int min, int max, String imgurl) {
        this.name = name;
        this.locate = locate;
        this.price = price;
        this.min = min;
        this.max = max;
        this.imgurl=imgurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "firstpageDTO{" +
                "name='" + name + '\'' +
                ", locate='" + locate + '\'' +
                ", price=" + price +
                ", min=" + min +
                ", max=" + max +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
