package com.aptota.lamda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> operator = (a, b)->a+b;
        BiFunction<Integer,Integer,Integer> operator2 = (a, b)->a+b;
        System.out.println(operator.apply(5, 10));
        System.out.println(operator2.apply(15, 110));
    }
}
