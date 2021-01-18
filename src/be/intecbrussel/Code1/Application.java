package be.intecbrussel.Code1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {

        Files.walk(Paths.get("/Users/gast/Downloads/unsorted"))
                .forEach(path -> System.out.println(path.getFileName()));


        String fromFile = "/home/mkyong/data/db.debug.conf";
        String toFile = "/home/mkyong/data/deploy/db.conf";

        Path source = Paths.get(fromFile);
        Path target = Paths.get(toFile);

        try {

            Files.copy(source, target);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
