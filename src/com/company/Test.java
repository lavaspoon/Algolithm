package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("React");

        //기존 방식
        for(String str : list) {
            System.out.println(str);
        }
        //람다 방식
        list.stream().forEach((String str) -> { System.out.println(str);});
        list.stream().forEach(str -> System.out.println(str));
        list.stream().forEach(System.out::println);
    }
}
