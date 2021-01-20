package be.intecbrussel.testcodes;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class TestGetAllFilesWithCertainExtMain {
    public static void main(String[] args) throws IOException {

        TestGetAllFilesWithCertainExtMain main=new TestGetAllFilesWithCertainExtMain();
        System.out.println("Finding files in the folder");
        System.out.println("-----------------");
        // Read the file
        File folder=new File("/Users/gast/Downloads/unsorted");
        main.getAllFilesWithCertainExtension(folder,"pdf");

        System.out.println("-----------------");
    }

    public  void getAllFilesWithCertainExtension(File folder,String filterExt) {
        MyExtFilter extFilter = new MyExtFilter(filterExt);

        if (!folder.isDirectory()) {
            System.out.println("Not a folder");
        } else {
            // list out all the file name and filter by the extension
            String[] list = folder.list(extFilter);
            if (list.length == 0) {
                System.out.println("no files end with : " + filterExt);
                return;
            }

            for (int i = 0; i < list.length; i++) {
                System.out.println("File :" + list[i]);
            }
        }

        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFilesWithCertainExtension(file, filterExt);
            }
        }

    }

    public class MyExtFilter implements FilenameFilter {

        private String ext;

        public MyExtFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return (name.endsWith(ext));
        }
    }
}
