package com.fpij.chpt2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaLambdaExamples {
    public static void main(String[] args) {
        citiesExample();

        System.out.println("\n===================================\n");

        bigDecimalExample();

        System.out.println("\n===================================\n");

        printFriendsExample();

        System.out.println("\n===================================\n");

        toUpperCaseNames();

        System.out.println("\n===================================\n");

        namesStartingwithAExample();

        System.out.println("\n===================================\n");

        reusingLambdaExample();

        System.out.println("\n===================================\n");

        reusingLambdaWithVariableInputExample();

        System.out.println("\n===================================\n");

        findFirstExample("Z");
        findFirstExample("T");

    }

    private static void findFirstExample(String letter) {
        final List<String> friends = Arrays.asList("Ravi", "Jack" , "Zach", "Alyssa", "Adie");

        final Optional<String> foundName = friends.stream()
                .filter(name -> name.startsWith(letter))
                .findFirst();

        final String foundNameStr = foundName.orElse("not found");
        System.out.println(String.format("Name starting with %s: %s", letter, foundNameStr));
    }

    private static void reusingLambdaWithVariableInputExample() {
        final List<String> friends = Arrays.asList("Ravi", "Jack" , "Zach", "Alyssa", "Adie");
        final Function<String, Predicate<String>> startsWithALetter = (final String letter) -> (final String name) -> name.startsWith(letter);

        System.out.print("Name starting with A \n ");
        friends.stream()
                .filter(startsWithALetter.apply("A"))
                .forEach(System.out::println);

        System.out.print("Name starting with Z \n ");
        friends.stream()
                .filter(startsWithALetter.apply("Z"))
                .forEach(System.out::println);
    }

    private static void reusingLambdaExample() {
        final List<String> friends = Arrays.asList("Ravi", "Jack" , "Zach", "Alyssa", "Adie");
        final List<String> editors = Arrays.asList("Ravi", "Jack" , "Andy", "Arch", "Piyali");
        final List<String> comrades = Arrays.asList("Ravi", "Arun" , "Anna", "Ann", "Annie");

        final Predicate<String> startsWithA = name -> name.startsWith("A");

        final long countFriendsStartA = friends.stream().filter(startsWithA).count();
        final long countEditorsStartA = editors.stream().filter(startsWithA).count();
        final long countComradesStartA = comrades.stream().filter(startsWithA).count();

        System.out.println("Friends starting with A " + countFriendsStartA);
        System.out.println("Editors starting with A " + countEditorsStartA);
        System.out.println("Comrades starting with A " + countComradesStartA);
    }

    private static void namesStartingwithAExample() {
        final List<String> friends = Arrays.asList("Ravi", "Jack" , "Zach", "Alyssa", "Adie");
        List <String> startWithA = friends.stream()
                                            .filter(s -> s.startsWith("A"))
                                            .collect(Collectors.toList());
        startWithA.forEach(System.out::println);
    }

    private static void toUpperCaseNames() {
        final List<String> friends = Arrays.asList("Ravi", "Jack" , "Zach", "Alyssa", "Adie");

        List <String> upperCaseNames = new ArrayList<String>();
        friends.stream()
                .forEach(name -> upperCaseNames.add(name.toUpperCase()));
        upperCaseNames.forEach(System.out::println);
    }

    private static void printFriendsExample() {
        final List<String> friends = Arrays.asList("Ravi", "Jack" , "Zach", "Alyssa", "Adie");
        friends.forEach(System.out::println);
    }

    private static void bigDecimalExample() {
        List<BigDecimal> bigDecimals = Arrays.asList(new BigDecimal("200"), new BigDecimal("300"), new BigDecimal("399.49"), new BigDecimal("571.54"));

        final BigDecimal total = bigDecimals.stream()
                .filter(s -> s.compareTo(BigDecimal.valueOf(200)) > 0)
                .map (s -> s.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total = " + total);
    }

    private static void citiesExample() {
        final List<String> cities = Arrays.asList("Chicago", "New York", "Philadelphis");

        System.out.println("Found Chicago? " + cities.contains("Chicago"));
    }
}
