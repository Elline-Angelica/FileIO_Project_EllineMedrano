package be.intecbrussel.Code1;

import be.intecbrussel.Code2.Organizer;
import be.intecbrussel.Code3.FileOrganizer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {

        Application app = new Application();
        app.scanFiles("/Users/gast/Downloads/finaltest","pdf");


    }

    public void scanFiles(String destinationfolder,String extension) throws IOException {
        Files.walk(Paths.get("/Users/gast/Downloads/unsorted"))
                .forEach(path -> {
                    if(path.endsWith(extension)){
                        String filepath = path.getFileName().toString();
                        String filepathext = filepath.substring(filepath.indexOf("."),filepath.length()+1);
                        File file = new File(destinationfolder+"/"+filepathext);
                        file.mkdirs();
                        System.out.println(path);
                        System.out.println();
                        System.out.println(file);

                        //File sourceFile = path.toFile();
                    } else {
                        System.out.println("idk");
                    }
                });
    }

    public void copy(File file, File outputFolder)
    {
        try {
            System.out.println("\tCopying [" + file + "] to folder [" + outputFolder + "]...");
            InputStream input = new FileInputStream(file);
            OutputStream out = new FileOutputStream(new File(outputFolder + File.separator + file.getName()));
            byte data[] = new byte[input.available()];
            input.read(data);
            out.write(data);
            out.flush();
            out.close();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}




