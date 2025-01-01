public class FindFirstEvenNumber {
    public static void main(String[] args) {
        // Example list of numbers
        int[] numbers = {1, 3, 5, 7, 8, 10, 12};

        // Variable to store the first even number
        int firstEven = -1;

        // Loop through the list to find the first even number
        for (int number : numbers) { // Enhanced for loop
            if (number % 2 == 0) {
                firstEven = number;
                break;
            }
        }

        // Display the result
        if (firstEven != -1) {
            System.out.println("The first even number in the list is: " + firstEven);
        } else {
            System.out.println("There are no even numbers in the list.");
        }
    }
}
