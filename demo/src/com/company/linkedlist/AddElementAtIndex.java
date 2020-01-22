package com.company.linkedlist;
import java.util.LinkedList;

public class AddElementAtIndex {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(55);
        list.add(3);
        list.add(76);
        list.add(43);
        list.add(3,11);
        System.out.println(list);

    }
}
