package ex_31_Exceptions;

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab_147_IQ {
    public static void main(String[] args) {
        System.out.println("Starting");
        try{
            FileReader f = new FileReader(new File("C:\\a.txt"));
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
