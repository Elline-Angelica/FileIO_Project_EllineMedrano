package be.intecbrussel.Code1;

import java.io.*;
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



//        String[] extensionType = new String[]{"csv","database","exe","gif","gitignore","jpg","json","hidden","pdf","png","py","summary","txt","wma","zip"};
//        Organizer og = new Organizer();
//
//
//        for(int i = 0; i<extensionType.length; i++){
//            //create destination dirs
//            //og.createNewSortedDirectories(extensionType[i]);
//            //scan files
//            Path path = Paths.get("/Users/gast/Downloads/unsorted");
//            List<Path> paths = listFiles(path);
//            paths.forEach(x -> System.out.println(x.getFileName()));
//            System.out.println();
//            List<Path> paths1 = findByFileExtension(path,extensionType[i]);
//            paths1.forEach(x -> System.out.println(x.getFileName()));
//            System.out.println();
//            //copy files to new path
//            //og.copyFiles("/Users/gast/Downloads/unsorted","/Users/gast/Downloads/sortedFolder/" + extensionType[i]);
//        }
//
//        //create summary


//
//    public void copyFiles(String sourcePath, String destinationPath) throws IOException {
//        Path from = Paths.get(sourcePath);
//        Path to = Paths.get(destinationPath);
//
//        Files.copy(from, to);
//    }
//
//    public void createNewSortedDirectories(String fex) throws IOException {
//        //sort by ext type
//        Path path = Paths.get("/Users/gast/Downloads/unsorted");
//        List<Path> paths = findByFileExtension(path, fex);
//        //paths.forEach(x -> System.out.println(x.getFileName()));
//        paths.toArray();
//
//        //main directory
//        File f = new File("/Users/gast/Downloads/sortedFolder");
//        f.mkdirs();
//
//
//        //sub directories
//        String newpath = "/Users/gast/Downloads/sortedFolder/" + fex ;
//        File file = new File(newpath);
//        file.mkdirs();
//    }
//
//    public static List<Path> listFiles(Path path) throws IOException {
//
//        List<Path> result;
//        try (Stream<Path> walk = Files.walk(path)) {
//            result = walk.filter(Files::isRegularFile)
//                    .collect(Collectors.toList());
//        }
//        return result;
//
//    }
//
//    public static List<Path> findByFileExtension(Path path, String fileExtension) throws IOException {
//
//        if (!Files.isDirectory(path)) {
//            throw new IllegalArgumentException("Path must be a directory!");
//        }
//
//        List<Path> result;
//        try (Stream<Path> walk = Files.walk(path)) {
//            result = walk
//                    .filter(Files::isRegularFile)   // is a file
//                    .filter(p -> p.getFileName().toString().endsWith(fileExtension))
//                    .collect(Collectors.toList());
//        }
//        return result;
//
//    }
//

}
