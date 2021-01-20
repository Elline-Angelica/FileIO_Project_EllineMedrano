package be.intecbrussel.Code1;

import be.intecbrussel.Code2.Organizer;
import be.intecbrussel.Code3.FileOrganizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {

        Files.walk(Paths.get("/Users/gast/Downloads/unsorted"))
                .forEach(path -> System.out.println(path.getFileName()));

    }
}




