/* You are tasked with developing a program that tracks a user's monthly expenses. The
program should repeatedly ask the user to input their expenses for different
categories (like food, transportation, etc.) until they type "done". After the user is
finished, display the total expenses for the month
*/
import java.util.Scanner;
public class Budget{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        double foodP = 0;
        double transportP = 0;
        double extra = 0;

        while (true) { 
            System.out.print("Enter expense category (food, transport, other, or type 'done' to get report:  ");
            String category = reader.nextLine().toLowerCase();
            if(category.equals("done")){
            break;
            }

            System.out.println("Enter the amount spent on " + category + ": ");
            double amount;
            amount = Double.parseDouble(reader.nextLine());

            switch(category){
                case "food":
                    foodP += amount;
                    break;
                case "transport":
                    transportP += amount;
                    break;
                default:
                    extra += amount;
                    break;
            }
        }

        double total = foodP + transportP + extra;
        System.out.println("----Monthly Report----");
        System.out.printf("Food : $%.2f%n", foodP);
        System.out.printf("Transport : $%.2f%n", transportP);
        System.out.printf("Other : $%.2f%n", extra);
        System.out.printf("Total Expenses : $%.2f%n", total);

        reader.close();
    }
        
}