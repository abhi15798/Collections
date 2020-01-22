package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String>colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println(colors.toString());
    }
}
