import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give the first number for storage");
        int x = reader.nextInt();
        
        System.out.println("Give the second number for storage");
        int y = reader.nextInt();

        System.out.println("Choose the operations based on numbers. 1 for Addition of the two numbers in storage; 2 for subtraction ; 3 for multiplication ; 5 for modulus operation ; 4 for division; 0 to exit.");
        int choice = reader.nextInt();

        switch(choice){
            case 1: //Addtion
            System.out.println("Result = " +(x+y));
            break;

            case 2: //Subtraction
            System.out.println("Result = " +(x-y));
            break;

            case 3: //Multiplication
            System.out.println("Result = " +(x*y));
            break;

            case 4: //Division
            System.out.println("Result = " +(x/y));
            break;

            case 5: //Modulus Operation
            System.out.println("Result = " +(x%y));

            case 0:
            System.out.println("Exiting the calculator. Goodbye");
            return;

            default:
            System.out.println("Invalid numbers were given");
        }

        reader.close();
    }
}

/* Given Input :
 * First number for storage = 89
 * Second number for storage = 32
 * Chosen Operation and its number : 3. Mulitplication
 * 
 * Output : 
 * Result = 2848
 */