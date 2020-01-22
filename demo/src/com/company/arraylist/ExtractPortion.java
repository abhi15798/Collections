package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractPortion {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        colors.add("silver");
        System.out.println(colors.subList(0,2));
    }
}
