package com.aptota.lamda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class AnonymousClassDemo {

    public static void main(String[] args) {
            Runnable run1 = ()-> System.out.println("Thread Running by "+Thread.currentThread());
            Runnable run2 = ()-> System.out.println("Thread Running by "+Thread.currentThread());
            Runnable run3 = ()-> System.out.println("Thread Running by "+Thread.currentThread());
            Runnable run4 = ()-> System.out.println("Thread Running by "+Thread.currentThread());
            Runnable run5 = ()-> System.out.println("Thread Running by "+Thread.currentThread());
            new Thread(run1).start();
            new Thread(run2).start();
            new Thread(run3).start();
            new Thread(run4).start();
            new Thread(run5).start();
    }



}
