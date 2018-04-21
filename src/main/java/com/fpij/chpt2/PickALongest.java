package com.fpij.chpt2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickALongest {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Ankur", "Ragini", "Nitin", "Ishita", "Patrick", "Justin");

        final Optional<String> longestName = friends.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

        longestName.orElse("No Longest Name found");

        longestName.ifPresent(System.out::println);

    }
}
