
public class insertionSort {
    /**
     * Insertion sort algorithm to sort an array in ascending order.
     * Time Complexity: O(n^2) - Quadratic
     * Space Complexity: O(1) - Constant (No extra space used)
     * 
     * @param A The array to be sorted
     */
    public static void InsertionSort(int A[]) {
        int n = A.length;

        // Iterate through the array, starting from the second element
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > A[j + 1]) {
                    // swap elements if the element found is greater than the next one
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void InsertionSort1(int A[]) {
        int n = A.length;

        // Iterate through the array, starting from the second element
        for (int i = 1; i < n; i++) {
            int key = A[i]; // Current element to be inserted at the correct position
            int j = i - 1;
            // Move elements of A[0..i-1], that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            // Insert the key at its correct position in the sorted subarray
            A[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int A[] = { 5, 0, 1, 3, 4, 9, 6, 7, 2, 8 };

        // Call InsertionSort method to sort the array
        InsertionSort(A);

        // Print the sorted array
        System.out.print("InsertionSort : ");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("InsertionSort1 : ");
        InsertionSort1(A);
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

}

/*  */
