package com.example.core.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();
        ListIterator<Integer> ltr = null;
        numberList.add(25);
        numberList.add(17);
        numberList.add(108);
        numberList.add(76);
        numberList.add(2);
        numberList.add(36);
        ltr = numberList.listIterator();
        //forward iteration
        System.out.println("\nIterating list in forward direction");
        while(ltr.hasNext()){
            int i = ltr.next();
        	System.out.print(" "+i);
            if(i == 2) {
             ltr.remove();//List iterator allows you to add and remove elements during iteration.
             ltr.add(1);
            } 
        }
        
        System.out.println("\nAfter deletion city" );
        for(Integer city : numberList){
            System.out.print(" " + city);
        }
        // backward iteration 
        System.out.println("\nIterating list in backward direction");
        while(ltr.hasPrevious()){
            System.out.print(" "+ltr.previous());
        }
    }
}
