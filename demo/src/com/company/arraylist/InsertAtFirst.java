package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
       colors.add(1,"blue");
        System.out.println("Elements of arrayList="+colors);
    }
}
