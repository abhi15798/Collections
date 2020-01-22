package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        System.out.println("old list"+colors);

        List<String> newList= new ArrayList<>();
        newList.addAll(colors);
        System.out.println("new list-"+newList);
    }
}
