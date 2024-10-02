package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_covariancia {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
      //  list.add(20); // erro de compilacao
    }

    public static void copy(List<? extends  Number> source,List<? super  Number> target){
        for(Number number: source){
            target.add(number);

        }


    }

}
