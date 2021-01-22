package be.intecbrussel.app;

import be.intecbrussel.service.FileOrganizer;

import java.io.FileWriter;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        // TestOrganizer organizer = new TestOrganizer();
        // organizer.manuallyMakeDirectories();
        // organizer.getFilesFromDirectory();

        FileOrganizer copyFiles = new FileOrganizer();
        copyFiles.copy("jpg", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/jpg");
        copyFiles.copy("csv", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/csv");
        copyFiles.copy("exe", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/exe");
        copyFiles.copy("gif", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/gif");
        copyFiles.copy("json", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/json");
        copyFiles.copy("pdf", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/pdf");
        copyFiles.copy("png", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/png");
        copyFiles.copy("py", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/py");
        copyFiles.copy("txt", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/text");
        copyFiles.copy("wma", "/Users/gast/Downloads/unsorted", "/Users/gast/Downloads/sorted/wma");

        try {
            FileWriter myWriter = new FileWriter("resources/summary.txt");
            myWriter.write("name   |        readable         |         writeable        |\n");
            myWriter.append("\npng:\n-----\n\nfile1: |         x               |                x         |");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
