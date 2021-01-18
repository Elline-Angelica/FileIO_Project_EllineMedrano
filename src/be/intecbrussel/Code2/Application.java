package be.intecbrussel.Code2;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        Organizer og = new Organizer();
        og.getArrayOfFilesInDirectory("/Users/gast/Downloads/unsorted");

    }
}
