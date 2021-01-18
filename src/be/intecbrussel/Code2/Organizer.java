package be.intecbrussel.Code2;

import be.intecbrussel.Code1.FileOrganizer;

import java.io.*;
import java.util.Arrays;

public class Organizer {

    // 1. find files
    // 2. make new directory
    // 3. copy unsorted

    public void getArrayOfFilesInDirectory (String folder) throws IOException {
        String [] pathNames;
        File f = new File (folder);
        pathNames = f.list();

        for (String pathname : pathNames) {
            getFileType(pathname);
        }

        File file = new File("resources/summary.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        for (String s : pathNames) {
            pw.write(getFileType(s) + "\n");
        }
        pw.close();

    }

    public static String getFileType(String path){
        Organizer og = new Organizer();
        String fileType = null;
        fileType = path.substring(path.indexOf('.',path.lastIndexOf('/'))+1);
        og.makeNewDirectory(fileType);
        return fileType;
    }

    public void makeNewDirectory (String nameNewFolder) {
        String path="/Users/gast/Downloads/test";
        String newFolder = nameNewFolder;
        File file = new File(path);

        if(!file.exists())
            file.mkdirs();

        file = new File(path + "/" + newFolder);
        file.mkdirs();
    }
}
