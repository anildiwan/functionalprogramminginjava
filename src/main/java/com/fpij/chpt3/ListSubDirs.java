package com.fpij.chpt3;

import java.io.File;
import java.util.stream.Stream;

public class ListSubDirs {
    public static void main(String[] args) {
        Stream.of(new File(".").listFiles())
                .flatMap(file -> file.listFiles() == null ? Stream.of(file) : Stream.of(file.listFiles()))
                .forEach(System.out::println);
    }
}
