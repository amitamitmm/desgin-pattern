package com.aptota.lamda;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapUsingLambdaStream {
    public static void main(String[] args) {
        Map<String, Fruit> fruitMap = new HashMap();
        fruitMap.put("Apple", new Fruit("Apple", BigDecimal.valueOf(200)));
        fruitMap.put("Banana", new Fruit("Banana", BigDecimal.valueOf(60)));
        fruitMap.put("Mango", new Fruit("Mango", BigDecimal.valueOf(120)));
        fruitMap.put("Papaya", new Fruit("Papaya", BigDecimal.valueOf(40)));
        fruitMap.put("Orange", new Fruit("Orange", BigDecimal.valueOf(140.50)));

        fruitMap.forEach((key,value)-> System.out.println(key + ": " + value));
        System.out.println("--------------------------------");

        Map<String, Fruit> sortedMap = fruitMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue((fruit1, fruit2) -> fruit2.getPrice().compareTo(fruit1.getPrice())))
//                .sorted((entry1, entry2) -> entry1.getValue().getPrice().compareTo(entry2.getValue().getPrice()))
//                .sorted(Map.Entry.comparingByKey((key1, key2) -> key2.compareTo(key1)))
//                .sorted(Comparator.comparing(Map.Entry::getKey))
//                .sorted(Comparator.comparingInt(entry->entry.getValue().getPrice().intValue()))
//                .sorted((entry1, entry2) -> entry2.getValue().getPrice().intValue()-entry1.getValue().getPrice().intValue())
//                .sorted(Comparator.comparingDouble(entry->entry.getValue().getPrice().doubleValue()))
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(
                        Collectors.toMap(
                        entry ->entry.getKey(),
                        entry -> entry.getValue(),
                        (fruit1, fruit2) -> fruit1,
                                LinkedHashMap::new));

        sortedMap.forEach((key,value)-> System.out.println(key + ": " + value));

    }
}

class Fruit implements Comparable<Fruit> {
    private String name;
    private BigDecimal price;

    public Fruit(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return o.price.compareTo(this.price);
    }
}