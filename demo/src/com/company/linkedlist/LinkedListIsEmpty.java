package com.company.linkedlist;

import java.util.LinkedList;

public class LinkedListIsEmpty {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(55);
        list.add(3);
        list.add(76);
        list.add(43);
        System.out.println("Is linked list empty="+list.isEmpty());
    }

}
