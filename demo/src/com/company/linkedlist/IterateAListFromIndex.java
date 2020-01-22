package com.company.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateAListFromIndex {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(55);
        list.add(3);
        list.add(76);
        list.add(43);
        Iterator iterator = list.listIterator(2);
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
