package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trim {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>() ;
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        System.out.println("before trim size="+colors.size());
        colors.trimToSize();
        System.out.println(colors.size());
    }
}
