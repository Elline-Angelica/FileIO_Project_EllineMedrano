package be.intecbrussel.Code1;

import be.intecbrussel.Code2.Organizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {

        Files.walk(Paths.get("/Users/gast/Downloads/unsorted"))
                .forEach(path -> {
                    path.toString().substring(path.toString().indexOf('.', path.toString().lastIndexOf('/')) + 1);
                    String filePath;
                    filePath = path.toString();
                    String sourceFile;
                    sourceFile = path.getFileName().toString();
                    makeNewDirectory(filePath);

                    String fromFile = "/Users/gast/Downloads/unsorted/" + sourceFile;
                    String toFile = "/Users/gast/Downloads/sorted_folder/" + filePath;

                    Path source = Paths.get(fromFile);
                    Path target = Paths.get(toFile);

                    try {
                        Files.copy(source, target);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    public static void makeNewDirectory (String nameNewExtFolder) {
        String path="/Users/gast/Downloads/sorted_folder";
        String newFolder = nameNewExtFolder;
        File file = new File(path);

        if(!file.exists())
            file.mkdirs();

        file = new File(path + "/" + nameNewExtFolder);
        file.mkdirs();
    }
}
