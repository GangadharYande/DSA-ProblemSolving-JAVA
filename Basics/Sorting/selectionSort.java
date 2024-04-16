public class selectionSort {

    /**
     * Selection sort algorithm to sort an array in ascending order.
     * Time Complexity: O(n^2) - Quadratic
     * Space Complexity: O(1) - Constant (No extra space used)
     * 
     * @param A The array to be sorted
     */
    public static void SelectionSort(int[] A) {
        int n = A.length;
        
        // Traverse the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min_idx]) {
                    min_idx = j;
                }
            }
            
            // Swap the minimum element with the first element of the unsorted part
            if (i != min_idx) {
                int temp = A[i];
                A[i] = A[min_idx];
                A[min_idx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {5, 0, 1, 3, 4, 9, 6, 7, 2, 8};
        
        // Call SelectionSort method to sort the array
        SelectionSort(A);
        
        // Print the sorted array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
