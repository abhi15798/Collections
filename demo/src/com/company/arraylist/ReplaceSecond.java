package com.company.arraylist;

import java.util.ArrayList;

public class ReplaceSecond {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        colors.set(1,"golden");
        System.out.println(colors);
    }
}
