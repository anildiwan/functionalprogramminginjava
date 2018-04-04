package com.fpij.chpt2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintList {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Anil", "Ragini");

        System.out.println(friends.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));


    }
}
