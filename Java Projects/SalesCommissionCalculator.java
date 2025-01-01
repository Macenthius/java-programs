import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();
        
        double[] sales = new double[numSalespeople];
        double[] commissions = new double[numSalespeople];
        double totalSales = 0;
        double totalCommission = 0;

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scanner.nextDouble();
            
            // Calculate commission as 10% of sales
            commissions[i] = sales[i] * 0.10;
            totalSales += sales[i];
            totalCommission += commissions[i];
        }

        System.out.println("\nSales and Commission Summary:");
        for (int i = 0; i < numSalespeople; i++) {
            System.out.printf("Salesperson %d: Sales = $%.2f, Commission = $%.2f%n", (i + 1), sales[i], commissions[i]);
        }
        System.out.printf("\nTotal Sales: $%.2f%n", totalSales);
        System.out.printf("Total Commission: $%.2f%n", totalCommission);
        
        scanner.close();
    }
}
