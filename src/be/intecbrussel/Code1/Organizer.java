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

        //scan files
        Organizer og = new Organizer();
        og.scanDirectory("/Users/gast/Downloads/unsorted");
        System.out.println();

        //create destination dirs
        og.createNewSortedDirectories("txt");

        //copy files to new path
        og.copyFiles("/Users/gast/Downloads/unsorted","/Users/gast/Downloads/anotha/txt");

        //create summmary

        ;


    }

    public void copyFiles(String sourcePath, String destinationPath) throws IOException {
        Path from = Paths.get(sourcePath);
        Path to = Paths.get(destinationPath);

        Files.copy(from, to);
    }

    public void createNewSortedDirectories(String fex) throws IOException {
        //sort by ext type
        Path path = Paths.get("/Users/gast/Downloads/unsorted");
        List<Path> paths = findByFileExtension(path, fex);
        //paths.forEach(x -> System.out.println(x.getFileName()));
        paths.toArray();

        //main directory
        for(Path s : paths){
            File f = new File("/Users/gast/Downloads/anotha");
            f.mkdirs();
        }

        //sub directories
        String newpath = "/Users/gast/Downloads/anotha/" + fex ;
        File file = new File(newpath);
        file.mkdirs();
    }

    public void scanDirectory(String sourcePath) throws IOException {
        Files.walk(Paths.get(sourcePath))
                .forEach(path -> System.out.println(path.getFileName()));
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
