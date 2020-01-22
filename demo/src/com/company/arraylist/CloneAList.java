package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloneAList {

    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        ArrayList<String> newColors;
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        System.out.println("color="+colors);
        newColors=(ArrayList<String>) colors.clone();
        newColors.add("qw");
        System.out.println(newColors);
        System.out.println("old again="+colors);
    }
}
