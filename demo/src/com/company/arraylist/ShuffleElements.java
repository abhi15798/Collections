package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElements {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
