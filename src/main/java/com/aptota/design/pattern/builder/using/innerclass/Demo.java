package com.aptota.design.pattern.builder.using.innerclass;

public class Demo {
    public static void main(String[] args) {
        Car hondaCity = new Car.CarBuilder("Honda")
                .alloyWheels(Boolean.TRUE)
                .cruiseControl(Boolean.TRUE)
                .sunroof(Boolean.TRUE)
                .electricSeats(Boolean.TRUE)
                .price(1200000)
                .build();

        Car swiftCar = new Car.CarBuilder("Suzuki")
                .alloyWheels(Boolean.FALSE)
                .cruiseControl(Boolean.FALSE)
                .sunroof(Boolean.FALSE)
                .electricSeats(Boolean.FALSE)
                .price(600000)
                .build();

        System.out.println(hondaCity);
        System.out.println(swiftCar);
    }
}
