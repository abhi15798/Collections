package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveIndex {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        colors.remove(3);
        System.out.println(colors);
    }
}
