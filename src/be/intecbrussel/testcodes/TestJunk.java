package be.intecbrussel.testcodes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestJunk {
    public static void main(String[] args) throws IOException {
        Files.walk(Paths.get("/Users/gast/Downloads/unsorted"))
                .forEach(path -> {
                            path.toString().substring(path.toString().indexOf('.', path.toString().lastIndexOf('/')) + 1);
                            String filePath;
                            filePath = path.toString();
                            String sourceFile;
                            sourceFile = path.getFileName().toString();
                            String fromFile = "/Users/gast/Downloads/unsorted/" + sourceFile;
                            String toFile = "/Users/gast/Downloads/sortedFolder/" + filePath;

                            Path source = Paths.get("/Users/gast/Downloads/unsorted/clean_code.gif");
                            Path target = Paths.get("/Users/gast/Downloads/sortedFolder/gif");

//                    makeNewDirectory(filePath);

                            try {
                                Files.copy(source, target);
                            } catch (IOException e) {
                                e.getMessage();
                            }
                        }
                );
    }



    //    public static void main(String[] args) throws IOException {
//        //functional programming concepts
//        Files.list(Paths.get(".")).forEach(System.out::println);
//
//    }
//
//    public void path_exists() throws Exception {
//        Path path =Paths.get("/Users/gast/IdeaProjects/FileIO_Project/resources/TextFile");
//
//    }

//    public static File[] dirListByExtension(File folder) throws IOException {
//        if (!folder.isDirectory() || !folder.exists()) {
//            throw new IOException( folder.getName() + " : Not a folder or not exist");
//        }
//        File files[] = Organizer.list(folder, false); // don't include subfolder
//        Arrays.sort(files, new Comparator() {
//            public int compare(final Object o1, final Object o2) {
//                String s1 = ((File) o1).getName().toLowerCase();
//                String s2 = ((File) o2).getName().toLowerCase();
//                final int s1Dot = s1.lastIndexOf('.');
//                final int s2Dot = s2.lastIndexOf('.');
//                //
//                if ((s1Dot == -1) == (s2Dot == -1)) { // both or neither
//                    s1 = s1.substring(s1Dot + 1);
//                    s2 = s2.substring(s2Dot + 1);
//                    return s1.compareTo(s2);
//                } else if (s1Dot == -1) { // only s2 has an extension, so s1 goes first
//                    return -1;
//                } else { // only s1 has an extension, so s1 goes second
//                    return 1;
//                }
//            }
//        });
//        return files;
//    }
//
//    public static File[] list(File folder, boolean includeSubFolder) {
//        if (!folder.isDirectory()) {
//            return null;
//        }
//        File files[] = folder.listFiles();
//        List<File> list = new ArrayList<File>();
//        for (File file : files) {
//            if (file.isDirectory()) {
//                if (includeSubFolder) {
//                    list.add(file);
//                }
//            }
//            else {
//                list.add(file);
//            }
//        }
//        if (list.isEmpty()) {
//            return null;
//        }
//        return list.toArray(new File[]{});
//    }

}
