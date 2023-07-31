package com.aptota.design.pattern.builder.using.innerclass;

public class Car {
    private final String make;
    private final Integer price;
    private final Boolean sunroof;
    private final Boolean alloyWheels;
    private final Boolean cruiseControl;
    private final Boolean electricSeats;

    public Car(CarBuilder builder){
            this.make = builder.make;
            this.price = builder.price;
            this.sunroof = builder.sunroof;
            this.alloyWheels = builder.alloyWheels;
            this.cruiseControl = builder.cruiseControl;
            this.electricSeats = builder.electricSeats;
    }

    static class CarBuilder{
        private  String make;
        private  Integer price;
        private  Boolean sunroof;
        private  Boolean alloyWheels;
        private  Boolean cruiseControl;
        private  Boolean electricSeats;

        public CarBuilder(String make){
            this.make = make;
        }
        public CarBuilder price(Integer price){
            this.price = price;
            return this;
        }
        public CarBuilder sunroof(Boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder alloyWheels(Boolean alloyWheels){
            this.alloyWheels = alloyWheels;
            return this;
        }
        public CarBuilder cruiseControl(Boolean cruiseControl){
            this.cruiseControl = cruiseControl;
            return this;
        }
        public CarBuilder electricSeats(Boolean electricSeats){
            this.electricSeats = electricSeats;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

    public String getMake() {
        return make;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean getSunroof() {
        return sunroof;
    }

    public Boolean getAlloyWheels() {
        return alloyWheels;
    }

    public Boolean getCruiseControl() {
        return cruiseControl;
    }

    public Boolean getElectricSeats() {
        return electricSeats;
    }

    @Override
    public String toString() {
        return "{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", sunroof=" + sunroof +
                ", alloyWheels=" + alloyWheels +
                ", cruiseControl=" + cruiseControl +
                ", electricSeats=" + electricSeats +
                '}';
    }
}
