package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElement {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        System.out.println("old list-"+colors);
        Collections.reverse(colors);
        System.out.println("reversed list"+colors);
    }
}
