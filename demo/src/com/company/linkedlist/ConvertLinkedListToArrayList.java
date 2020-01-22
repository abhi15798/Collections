package com.company.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(55);
        list.add(3);
        list.add(76);
        list.add(43);
        ArrayList<Integer> arrayList=new ArrayList<>(list);
        System.out.println(arrayList);
    }
}
