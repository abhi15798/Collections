package com.company.linkedlist;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(55);
        list.add(3);
        list.add(76);
        list.add(43);
        System.out.println("remove first="+list.pop());
        System.out.println("print first after remove ="+list.peek());
        System.out.println("complete list after 1st remove"+list);
        System.out.println(list.contains(3));
    }
}
