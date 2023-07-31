package com.aptota.design.pattern.builder.using.constructor;

public class PhoneBuilder {
    private String model;
    private String os;
    private Integer price;
    private String camera;

    public PhoneBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder withOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder withPrice(Integer price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder withCamera(String camera) {
        this.camera=camera;
        return this;
    }

    public Phone build() {
        return new Phone(model,os,price,camera);
    }

}
