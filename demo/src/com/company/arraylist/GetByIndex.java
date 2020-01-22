package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GetByIndex {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        System.out.println(colors.get(2));
    }
}
