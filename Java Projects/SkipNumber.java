public class SkipNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip the rest of the loop for this iteration
            }
            System.out.println(i);
        }
    }
}
