import java.util.Scanner;

public class FitnessApp {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int[] steps = new int[7];   //Array to store Steps for each day 
        String [] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int totalSteps = 0; //To accumulate total Steps
    
        System.out.println("Enter your daily Steps for the week: ");

        //Collect Steps for each day
        for(int i = 0; i < 7; i++)
        {
            System.out.print(daysOfWeek[i] +": ");
            
            while(!scan.hasNextInt()){
                System.out.println("Invalid input! Enter a valid number for" + daysOfWeek[i] + ": ");
                scan.next(); //Clear Invalid input
            }
            steps[i] = scan.nextInt();
            totalSteps += steps[i];  //Add to Total
        }
        // Calculate average steps
        double averageSteps = totalSteps /7.0;

        //display result
        System.out.println("\n__Weekly Fitness Summary");
        System.out.println("TotalSteps taken: "+totalSteps);
        System.out.printf("Average Steps per day :%.2f%n",averageSteps);

        scan.close();
    }
}