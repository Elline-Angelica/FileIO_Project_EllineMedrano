package be.intecbrussel.testcodes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

    public static void showFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getAbsolutePath());
                showFiles(file.listFiles()); // Calls same method again.
            } else {
                System.out.println("File: " + file.getAbsolutePath());
            }
        }
    }

    public static void main(String[]args){
         String extension = "txt";
         File sourceDir = new File("Users/gast/Downloads/unsorted");
         File destinationDir = new File("Users/gast/Downloads/test/"+extension);

         File[] files = sourceDir.listFiles((File pathname) -> pathname.getName().endsWith(extension));
         for(File f : files ){
            Path sourcePath      = Paths.get(sourceDir.getAbsolutePath()+"\\"+f.getName());
            Path destinationPath = Paths.get(destinationDir.getAbsolutePath()+"\\"+f.getName());

            try {
                Files.copy(sourcePath, destinationPath);
            } catch (IOException e) {
                //moving file failed.
                e.printStackTrace();
            }
        }
    }
}
