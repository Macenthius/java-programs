import java.util.Scanner;

public class MatrixAss{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = reader.nextInt();
        System.out.println("Enter the number of columns");
        int cols = reader.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter elements of first matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Element [" + i + "][" + j +"]: ");
                matrix1[i][j] = reader.nextInt();

        System.out.println("Enter elements of second matrix");
        for (i = 0; i < rows ; i++){
            for(j = 0; j < cols; j++){
                System.out.println("Elements [" + i + "][" + j + "]: ");
                matrix2[i][j] = reader.nextInt();
            }
        }

        
        }
            }
        }
    }
}