package be.intecbrussel.Code2;

import be.intecbrussel.Code1.FileOrganizer;

import java.io.*;
import java.util.Arrays;

public class Organizer {

    // 1. find files
    // 2. make new directory
    // 3. copy unsorted

    public static void main(String[] args) {
        Organizer og = new Organizer();
        og.getListOfFilesInDirectory("/Users/gast/Downloads/unsorted");

    }

    public static String getFileType(String path){
        String fileType = null;
        fileType = path.substring(path.indexOf('.',path.lastIndexOf('/'))+1);
        return fileType;
    }

    public void makeNewDirectory (String nameNewFolder) {
        String path="/Users/gast/Downloads/sorted";
        String newFolder = nameNewFolder;
        File file = new File(path);

        if(!file.exists())
            file.mkdirs();

        file = new File(path + "/" + newFolder);
        file.mkdirs();
    }

    public void getListOfFilesInDirectory (String folder){
        String [] pathnames;
        File f = new File (folder);
        pathnames = f.list();

        for (String pathname : pathnames) {
            if (pathname == "gif") {
                makeNewDirectory(getFileType(pathname));

            }
        }
    }

}
