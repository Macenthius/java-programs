/*
 * Write a Java Program to calculate the average of two numbers
 */

import java.util.Scanner;

public class MethodAvg{
    public void GiveSum(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter two numbers to gain their sum");
            int a = sc.nextInt();
            int b = sc.nextInt();
            double c = a+b/2;
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        MethodAvg methodAvg = new MethodAvg();
        methodAvg.GiveSum();
    }
}