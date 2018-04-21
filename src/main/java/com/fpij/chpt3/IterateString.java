package com.fpij.chpt3;

public class IterateString {
    public static void main(String[] args) {
        final String str = "22--eeanil";
        str.chars()
                .mapToObj(chr -> Character.valueOf((char)chr))
                .forEach(System.out::println);

    }

}
