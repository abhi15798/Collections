package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorProblem {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        Iterator iterator= colors.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
