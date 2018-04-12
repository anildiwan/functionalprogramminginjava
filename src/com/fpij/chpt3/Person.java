package com.fpij.chpt3;

public class Person {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Person (String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ageDifference (Person person2) {
        return this.age - person2.age;
    }

    public String toString () {
        return this.name + " - " + this.age;
    }

}
