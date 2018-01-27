package com.learn.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test{
    /**
     * @param args
     */
    public static void main(String [] args){
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("a");
        Set<String> set=new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("a");
        System.out.println(list.size()+","+set.size());
    }
}