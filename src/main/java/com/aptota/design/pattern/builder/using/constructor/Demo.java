package com.aptota.design.pattern.builder.using.constructor;

public class Demo {
    public static void main(String[] args) {
        Phone iphone15 = new PhoneBuilder()
                .withOs("Mac OS X")
                .withModel("Iphone 15")
                .withCamera("12 Mega Pixel")
                .withPrice(78000).build();
        System.out.println(iphone15);
        Phone onePlus = new PhoneBuilder()
                .withOs("Android OS")
                .withModel("One Plus 10")
                .withCamera("60 Mega Pixel")
                .withPrice(32000).build();
        System.out.println(onePlus);
    }
}
