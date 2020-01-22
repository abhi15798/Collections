package com.company.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class GetFirstAndLastOccuranceOfElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> occurrenceList= new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(55);
        list.add(3);
        list.add(76);
        list.add(43);
        list.add(3);
        Integer element = 3;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==3){
                occurrenceList.add(i);
            }
        }
        System.out.println("first occurrence of element at index="+occurrenceList.getFirst());
        System.out.println("last occurrence of element at index="+occurrenceList.getLast());

    }
}
