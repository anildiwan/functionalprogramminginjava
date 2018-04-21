package com.fpij.chpt3;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayTest {

    public static void main(String[] args) {
        String[] braces = {"(", "{", "{", "{", "{","]", "]", "["};

        Map<String, Long> map = Stream.of(braces).collect(Collectors.groupingBy(brace -> brace, Collectors.counting()));

        System.out.println(map);
    }
}
