import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Example sorted arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Merged array to store the result
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Merge arrays while both have elements
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements of array1
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements of array2
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        // Print the merged sorted array
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
}
