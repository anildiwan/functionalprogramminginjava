package com.fpij.chpt2;

import java.util.OptionalInt;

public class UniqueCharFinder {
    public static void main (String args [])
    {
        String input = "BCBNlambCBC";

        System.out.println("First non repeating char " + firstNonRepeatingChar(input));

    }

    private static char firstNonRepeatingChar(String input) {

            OptionalInt value = input.chars()
                        .filter(c -> input.chars().filter(s -> s == c).count() == 1)
                        .findFirst();

            if (value.isPresent())
                return (char) value.getAsInt();
            else
                return '-';
    }

}
