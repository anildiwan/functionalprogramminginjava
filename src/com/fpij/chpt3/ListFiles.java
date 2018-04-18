package com.fpij.chpt3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListFiles {
    public static void main(String[] args) {
        try {
            Files.list(Paths.get("."))
                    .filter(Files::isDirectory)
                    .forEach(System.out::println);

            Files.newDirectoryStream(Paths.get("./src/com/fpij/chpt2"), path -> path.toString().endsWith(".java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
