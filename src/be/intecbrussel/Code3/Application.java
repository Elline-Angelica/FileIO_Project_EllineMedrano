package be.intecbrussel.Code3;

import be.intecbrussel.Code2.Organizer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Application {

    public static void main(String[] args) throws IOException {

        // Organizer organizer = new Organizer();
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

    }
}
