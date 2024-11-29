//Write a Java Program to read from a file and display on the console.
//getAbsolutePath();
//canWrite();
//canRead();
//exists();
//getName();
//Assignment 3 : Create a file and get the file attributes


import java.io.FileWriter;
import java.io.IOException;

public class FileTyper{
    public static void main(String[] args){
        try {
            FileWriter Typer = new FileWriter("ExFile.txt");
            Typer.write("I am writing in a text file");
            Typer.close();
            System.out.println("File was written in successfully");
        } catch (IOException e) {
            System.out.println("An error has occured. File was not written in successfully");
        }
    }
}