package main.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkingWithFile {
    public static void main(String[] args) {
        //write();
        read();
    }
    public static void write(){
            System.out.println("Writing to file!");
            String text = "Hello World :)";
            Path fileName = Path.of("src/main/io/MyFileFromJava.txt");
        try {
            Files.writeString(fileName, text);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can't write to file! MSG: " + e.getMessage());
        }
    }
    public static void read(){
        System.out.println("Reading from file!");
        Path fileName = Path.of("src/main/io/MyFileFromJava.txt");
        try {
            String content = Files.readString(fileName);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can't read from file! MSG: " + e.getMessage());
        }
    }
}
