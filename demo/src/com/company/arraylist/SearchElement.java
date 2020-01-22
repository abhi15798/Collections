package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<Integer> colors=new ArrayList<>();
        colors.add(6);
        colors.add(4);
        colors.add(2);
        colors.add(1);
        colors.add(1,77);
        System.out.println("Element found="+colors.contains(2));
    }
}
