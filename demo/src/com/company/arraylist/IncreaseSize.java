package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;

public class IncreaseSize {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        System.out.println("size"+colors.size());
        colors.ensureCapacity(20);
        System.out.println(colors.size());
    }
}
