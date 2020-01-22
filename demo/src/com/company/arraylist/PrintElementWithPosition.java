package com.company.arraylist;

import java.util.ArrayList;

public class PrintElementWithPosition {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        int i=0;
        for (String colList: colors)
        {
            System.out.println("index="+i+" "+"value="+colList);
            i++;
        }

    }
}
