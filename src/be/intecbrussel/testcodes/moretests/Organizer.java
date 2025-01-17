package be.intecbrussel.testcodes.moretests;

import java.io.*;

public class Organizer {

    // 1. find files - done
    // 2. make new directory - done
    // 3. copy unsorted - still figuring out
    // 4. summary text?? - still figuring out as well

    public void getArrayOfFilesInDirectory (String folder) throws IOException {
        String [] pathNames;
        File f = new File (folder);
        pathNames = f.list();

        for (String pathname : pathNames) {
            getFileType(pathname);
        }

        File file = new File("resources/summary2.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        for (String s : pathNames) {
            pw.write(getFileType(s) + "\n");
        }
        pw.close();
    }

    public static String getFileType(String path){
        Organizer og = new Organizer();
        String fileType;
        fileType = path.substring(path.indexOf('.',path.lastIndexOf('/'))+1);
        og.makeNewDirectory(fileType);
        return fileType;
    }

    public void makeNewDirectory (String nameNewExtFolder) {
        String path="/Users/gast/Downloads/test";
        String newFolder = nameNewExtFolder;
        File file = new File(path);

        if(!file.exists())
            file.mkdirs();

        file = new File(path + "/" + nameNewExtFolder);
        file.mkdirs();
    }
}
