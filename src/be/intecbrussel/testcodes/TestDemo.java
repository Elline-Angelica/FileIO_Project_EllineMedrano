package be.intecbrussel.testcodes;

import java.io.*;

public class TestDemo {

    public static void main(String a[]){

        File file = new File("/home/students/");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".py")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }

}
