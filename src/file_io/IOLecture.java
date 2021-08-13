package file_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IOLecture {


    // THis is writing to js example
//    public static void main(String[] args) throws IOException {
//
//        String directory = "js";
//        String filename = "madeByJava.js";
//
//        // WHen writing multi lined content you will use a collection to hold each line.
//        ArrayList<String> fileContents = new ArrayList<String>();
//
//        // each string that we add to the fileContents Collection will represent
//        // a line to write on the file
//        fileContents.add("const message = \"Hello World\"");
//        fileContents.add("// written by java file system");
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        //Check if a dir exits
//        if (Files.notExists(dataDirectory)) {
//            // if the dir does not exist, we will create it
//            Files.createDirectories(dataDirectory);
//        }
//
//        // checking to so if a file does not exits
//        if (! Files.exists(dataFile)) {
//            // if the the file does not exist we will create it
//            Files.createFile(dataFile);
//        }
//
//        // THis will write contents to the file
////        Files.write(dataFile,fileContents);
//
//        // This is how you will read a files contents and store it in a collection
//        List<String> contentsReadFromFile = Files.readAllLines(dataFile);
//
//
//        System.out.println(contentsReadFromFile);
//    }

    public static void main(String[] args) throws IOException {
        String directory = "src/file_io";
        String filename = "hello.sh";

        // WHen writing multi lined content you will use a collection to hold each line.
        ArrayList<String> fileContents = new ArrayList<String>();

        // each string that we add to the fileContents Collection will represent
        // a line to write on the file
        fileContents.add("say Your going to have to much fun with the say command");

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        //Check if a dir exits
        if (Files.notExists(dataDirectory)) {
            // if the dir does not exist, we will create it
            Files.createDirectories(dataDirectory);
        }

        // checking to so if a file does not exits
        if (! Files.exists(dataFile)) {
            // if the the file does not exist we will create it
            Files.createFile(dataFile);
        }

        // THis will write contents to the file
        Files.write(dataFile,fileContents, StandardOpenOption.APPEND);

        // This is how you will read a files contents and store it in a collection
        List<String> contentsReadFromFile = Files.readAllLines(dataFile);


        for (String line : contentsReadFromFile) {
            System.out.println(line);
        }
    }

}
