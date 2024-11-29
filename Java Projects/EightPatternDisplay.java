public class EightPatternDisplay {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // Loop from 5 to 1
            for (int j = 1; j <= i; j++) { // Print '8' i times
                System.out.print("8");
            }
            System.out.println(); // Move to the next line
        }
    }
}
