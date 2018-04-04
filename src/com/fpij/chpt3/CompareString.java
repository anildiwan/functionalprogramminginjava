package com.fpij.chpt3;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareString {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person ("Ragini", 35), new Person("Anil", 40), new Person("Piyush", 21));

        Comparator<Person> compareAge = (person1, person2) -> person1.ageDifference(person2);

        Comparator<Person> compareAgeReverse = compareAge.reversed();

        System.out.println("People sorted by age ascending");

        people.stream()
                .sorted(compareAge)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("\nPeople sorted by age descending");

        people.stream()
                .sorted(compareAgeReverse)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nPeople sorted by name");

        people.stream()
                .sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
