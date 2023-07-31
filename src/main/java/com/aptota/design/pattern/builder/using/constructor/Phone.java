package com.aptota.design.pattern.builder.using.constructor;

public class Phone {
    private String model;
    private String os;
    private Integer price;
    private String camera;

    public Phone(String model, String os, Integer price, String camera) {
        this.model = model;
        this.os = os;
        this.price = price;
        this.camera = camera;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                ", camera='" + camera + '\'' +
                '}';
    }
}
