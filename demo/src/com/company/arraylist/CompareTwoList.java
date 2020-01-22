package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTwoList {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        List<String> newColors= new ArrayList<>();
        newColors.add("red");
        newColors.add("golden");
        newColors.add("white");
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");

        System.out.println(newColors.containsAll(colors));
    }
}
