package com.aptota.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIntegerArray {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int arraySize = 100000;
        int [] numbers = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            numbers[i] = (int)(Math.random()*arraySize);
        }

        Arrays.sort(numbers);
        int minDistance = Integer.MAX_VALUE;
        for(int i = 0, j=1; i<numbers.length-1; i++, j++){
            int minValue = Math.abs(numbers[i]-numbers[j]);
            if(minValue!=0 && minValue<minDistance){
                minDistance = minValue;
            }
        }
        System.out.println(minDistance);

  /*      int i = Arrays.stream(numbers)
                .flatMap(x -> Arrays.stream(numbers).map(y -> Math.abs(x - y)))
                .filter(x -> x > 0)
                .min().orElse(-1);
        System.out.println(i);*/


   /*     int minDistVal = Arrays.stream(numbers)
                .parallel()
                .flatMap(x -> Arrays.stream(numbers).parallel().map(y -> Math.abs(x - y)))
                .filter(n -> n > 0)
                .min().orElse(-1);
        System.out.println("Minimum value = "+minDistVal);*/

//20835
//3243

       /* List<Integer> numberList = Arrays.stream(numbers).boxed().toList();
        long timeInBoxed = System.currentTimeMillis()-startTime;
        System.out.println("Total time in autoboxed :: "+timeInBoxed);
        int minValue = numberList.parallelStream()
                .mapToInt(Integer::intValue)
                .flatMap(x -> numberList.parallelStream().mapToInt(Integer::intValue).map(y -> Math.abs(x - y)))
                .filter(x -> x > 0)
                .min().orElse(-1);
        System.out.println("Short distance = "+minValue);*/
        long timeInFindingMinDist = System.currentTimeMillis()-startTime;
        System.out.println("Total time in FindingMinDist :: "+timeInFindingMinDist);


     /*   int minNumber = numberList.parallelStream()
                .flatMap(x -> numberList.parallelStream().map(y -> Math.abs(x - y)))
                .filter(x -> x > 0)
                .sorted()
                .findFirst()
                .orElse(-1);
        System.out.println(minNumber);

        System.out.println(System.currentTimeMillis()-startTime);*/

        //93739 without parallel
        //26744 with parallel

    }
}
