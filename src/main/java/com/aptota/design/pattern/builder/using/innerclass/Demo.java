package com.aptota.design.pattern.builder.using.innerclass;

import java.util.List;
import java.util.Map;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


        Stream<Car> carStream = Stream.of(hondaCity, swiftCar);
        Predicate<Car> pricePredicate = car -> car.getPrice()>1000000;
        Predicate<Car> cruseControlPredicate = car -> car.getCruiseControl();
        carStream
                .filter(pricePredicate.and(cruseControlPredicate))
                .sorted((car1, car2) -> car2.getPrice() - car1.getPrice())
                .map(car -> {
                    System.out.println(car.getMake());
                    return car;
                }).forEach(System.out::println);

    }
}
