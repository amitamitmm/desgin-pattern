package com.aptota.lamda;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 10, 17);
        numbers.stream()
                .filter(num->num%2==0)
//                .map(num->num*num)
                .map(num->Math.multiplyExact(num,num))
//                .mapToInt(Double::intValue)
                .forEach(Demo::printNumbers);
    }

    public static void printNumbers(int num){
        System.out.print(num+ ", ");
    }
}
