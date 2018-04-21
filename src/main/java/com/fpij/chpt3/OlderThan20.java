package com.fpij.chpt3;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class OlderThan20 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person ("Parnika", 21),new Person ("Sunakshi", 21),new Person ("Ragini", 35), new Person("Anil", 40), new Person("Piyush", 21));

        List<Person> olderThan20 = new ArrayList<>();

        Comparator<Person> byAge = Comparator.comparing(Person::getAge);

        Map<Integer, List<String>> groupPeople = people.stream()
                .collect(
                        Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));

        groupPeople.forEach((index, groupedPeople) ->
             System.out.println(index + " - " + groupedPeople)
        );

        Map<Character, Optional<Person>> oldestPersonOfEachLetter = people.stream()
                                                                        .collect(Collectors.groupingBy(person -> person.getName().charAt(0), Collectors.reducing(BinaryOperator.maxBy(byAge))));

        System.out.println("oldest person by char");

        System.out.println(oldestPersonOfEachLetter);

    }
}
