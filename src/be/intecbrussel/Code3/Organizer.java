package be.intecbrussel.Code3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Organizer {
    public static void main(String[] args) throws IOException {

        Files.walk(Paths.get("/Users/gast/Downloads/unsorted"))
        .forEach(path -> System.out.println(path.getFileName()));



    }
}
