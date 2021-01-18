package be.intecbrussel.Code1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1. find files - done
// 2. make new directory - done
// 3. copy unsorted - still figuring out
// 4. summary text?? - still figuring out as well

public class Organizer {
    public static void main(String[] args) throws IOException {

        Files.walk(Paths.get("/Users/gast/Downloads/unsorted"))
        .forEach(path -> System.out.println(path.getFileName()));

        System.out.println();

        Path path = Paths.get("/Users/gast/Downloads/unsorted");
        List<Path> paths = findByFileExtension(path, ".txt");
        paths.forEach(x -> System.out.println(x.getFileName()));
    }

    public static List<Path> findByFileExtension(Path path, String fileExtension)
            throws IOException {

        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory!");
        }

        List<Path> result;
        try (Stream<Path> walk = Files.walk(path)) {
            result = walk
                    .filter(Files::isRegularFile)   // is a file
                    .filter(p -> p.getFileName().toString().endsWith(fileExtension))
                    .collect(Collectors.toList());
        }
        return result;

    }


}
