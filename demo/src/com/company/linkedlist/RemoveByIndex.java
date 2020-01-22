package com.company.linkedlist;

import java.util.LinkedList;

public class RemoveByIndex {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1= new LinkedList<>();
        list1.add(4);
        list1.add(55);
        list.add(1);
        list.add(4);
        list.add(55);
        list.add(3);
        list.add(76);
        list.add(43);
        list.remove(3);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);
    }
}
