package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        try{
            writeToFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Exception thrown");
        }
    }

    public static void writeToFile() throws Exception{
        try {
            FileWriter w = new FileWriter("testW.txt");

        }catch (FileNotFoundException e ){
            System.out.println("file not found");
            // throw new FileNotFoundException(e.getMessage());
            throw new Exception(e.getMessage());
        }catch (IOException e){
            System.out.println("IO exception");
        }
//        finally {
//            System.out.println("Finally");
//        }
    }
}
