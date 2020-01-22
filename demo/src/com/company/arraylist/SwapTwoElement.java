package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElement {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        System.out.println("old"+colors);
        Collections.swap(colors,0,3);
        System.out.println("after swap="+colors);
    }
}
