import java.util.Scanner;

public class MethodSum{
    public void GiveSum(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter two numbers to gain their sum");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        MethodSum methodSum = new MethodSum();
        methodSum.GiveSum();
    }
}