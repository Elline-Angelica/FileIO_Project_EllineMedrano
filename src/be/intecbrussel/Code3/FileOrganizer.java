package be.intecbrussel.Code3;

import java.io.*;

public class FileOrganizer {

    public void getFilesFromDirectory(){

        File directoryPath = new File("/Users/gast/Downloads/sorted");
        File filesList[] = directoryPath.listFiles();
        System.out.println("List of files and directories in the specified directory:");
        for(File file : filesList) {
            System.out.println("File name: "+file.getName());
            System.out.println("File path: "+file.getAbsolutePath());
            System.out.println("Size :"+file.getTotalSpace());
            System.out.println(" ");
        }

    }

    public void manuallyMakeDirectories() {

        String csv = "/Users/gast/Downloads/sorted/csv";
        File file = new File(csv);
        file.mkdirs();

        String database = "/Users/gast/Downloads/sorted/database";
        File file1 = new File(database);
        file1.mkdirs();

        String exe  = "/Users/gast/Downloads/sorted/exe";
        File file2 = new File(exe);
        file2.mkdirs();

        String gif  = "/Users/gast/Downloads/sorted/gif";
        File file3 = new File(gif);
        file3.mkdirs();

        String gitignore = "/Users/gast/Downloads/sorted/gitignore";
        File file4 = new File(gitignore);
        file4.mkdirs();

        String jpg  = "/Users/gast/Downloads/sorted/jpg";
        File file5 = new File(jpg);
        file5.mkdirs();

        String json  = "/Users/gast/Downloads/sorted/json";
        File file6 = new File(json);
        file6.mkdirs();

        String hidden  = "/Users/gast/Downloads/sorted/hidden";
        File file7 = new File(hidden);
        file7.mkdirs();

        String pdf  = "/Users/gast/Downloads/sorted/pdf";
        File file8 = new File(pdf);
        file8.mkdirs();

        String png  = "/Users/gast/Downloads/sorted/png";
        File file9 = new File(png);
        file9.mkdirs();

        String py  = "/Users/gast/Downloads/sorted/py";
        File file10 = new File(py);
        file10.mkdirs();

        String summary  = "/Users/gast/Downloads/sorted/summary";
        File file11 = new File(summary);
        file11.mkdirs();

        String txt  = "/Users/gast/Downloads/sorted/text";
        File file12 = new File(txt);
        file12.mkdirs();

        String wma  = "/Users/gast/Downloads/sorted/wma";
        File file13 = new File(wma);
        file13.mkdirs();

        String zip  = "/Users/gast/Downloads/sorted/zip";
        File file14 = new File(zip);
        file14.mkdirs();
    }

    private FileTypeOrFolderFilter filter = null;

    public void copy(final String fileType, String fromPath, String outputPath) {
        filter = new FileTypeOrFolderFilter(fileType);
        File currentFolder = new File(fromPath);
        File outputFolder = new File(outputPath);
        scanFolder(fileType, currentFolder, outputFolder);
    }

    public void scanFolder(String fileType, File currentFolder, File outputFolder) {
        System.out.println("Scanning folder [" + currentFolder + "]...");
        File[] files = currentFolder.listFiles(filter);
        for (File file : files) {
            if (file.isDirectory()) {
                scanFolder(fileType, file, outputFolder);
            } else {
                copy(file, outputFolder);
            }
        }
    }

    public void copy(File file, File outputFolder) {
        try {
            System.out.println("\tCopying [" + file + "] to folder [" + outputFolder + "]...");
            InputStream input = new FileInputStream(file);
            OutputStream out = new FileOutputStream(new File(outputFolder + File.separator + file.getName()));
            byte data[] = new byte[input.available()];
            input.read(data);
            out.write(data);
            out.flush();
            out.close();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final class FileTypeOrFolderFilter implements FileFilter {
        private final String fileType;

        public FileTypeOrFolderFilter(String fileType) {
            this.fileType = fileType;
        }

        public boolean accept(File pathname) {
            return pathname.getName().endsWith("." + fileType) || pathname.isDirectory();
        }
    }
}
