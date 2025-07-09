package ex_31_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_148_Throws {
    public static void main(String[] args) {

    }

    static void t() throws FileNotFoundException{
        FileInputStream fs = new FileInputStream("C:\\a.txt");
    }
}
