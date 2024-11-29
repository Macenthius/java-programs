//Check end of file. scanner.hasNextLine() == True / False.
// Lab Assignment : Write a problem to read from a file, and write it into another file.
// 2nd Question : Write a Java Program to read 3 values from user, and display its addition in file.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNextLine {
    public static void main(String[] args){
        try{
            File f1 = new File("ExFile.txt");
            Scanner scanner = new Scanner(f1);
            while(scanner.hasNextLine()){
                String fromFile = scanner.nextLine();
                System.out.println(fromFile);
            }
            scanner.close();
        }catch(FileNotFoundException exception){
            System.out.println("Unexpected error occured");
            exception.printStackTrace();
        }
    }
}