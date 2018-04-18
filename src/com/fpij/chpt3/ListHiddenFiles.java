package com.fpij.chpt3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ListHiddenFiles {
    public static void main(String[] args) {

            File[] hiddenFiles = new File("/Users/anildiwan").listFiles(file -> file.isHidden());

            Arrays.asList(hiddenFiles).forEach(System.out::println);


    }
}
