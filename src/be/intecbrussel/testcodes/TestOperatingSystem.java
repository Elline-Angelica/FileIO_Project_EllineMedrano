package be.intecbrussel.testcodes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestOperatingSystem {

    public static void main(String[] args) throws IOException {



        Path organizer = Files.copy(
                        Paths.get("Users/gast/Downloads/unsorted/"+"elements"),
                        Paths.get("Users/gast/Downloads/sorted_Folder/"+"extension directory"+"/"+"elements"));

        if(organizer != null) {
            System.out.println("File renamed and moved successfully");
        } else {
            System.out.println("Failed to move the file");
        }
    }


    public static void callMethod(String... args) throws IOException {
        Path dir = Paths.get("Users/gast/Downloads/unsorted");
        Files.walk(dir).forEach(path -> showFile(path.toFile()));
    }

    public static void showFile(File file) {
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());
        } else {
            System.out.println("File: " + file.getAbsolutePath());
        }
    }
}

