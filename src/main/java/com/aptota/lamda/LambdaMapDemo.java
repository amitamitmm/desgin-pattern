package com.aptota.lamda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap();
        fruitMap.put("Apple", 200);
        fruitMap.put("Banana", 60);
        fruitMap.put("Mango", 120);
        fruitMap.put("Papaya", 40);
        fruitMap.put("Orange", 140);
        System.out.println("After sorting");
        Comparator<Map.Entry<String, Integer>> sortByFruitPrice = (entry1, entry2) -> entry2.getValue()-entry1.getValue();
        Map<String, Integer> sortedFruitMap =  fruitMap.entrySet()
                .stream()
                .sorted(sortByFruitPrice)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        sortedFruitMap.forEach((key,value)-> System.out.println(key + "=" + value));
    }
}
