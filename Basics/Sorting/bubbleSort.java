

public class bubbleSort {

    /**
     * Bubble sort algorithm to sort an array in ascending order.
     * Time Complexity: O(n^2) - Quadratic
     * Space Complexity: O(1) - Constant (No extra space used)
     * 
     * @param A The array to be sorted
     */
    public static void BubbleSort(int A[]) {
        int n = A.length;
        
        // Outer loop to traverse through the array
        for (int i = 0; i < n - 1; i++) {
            
            // Inner loop to compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++) {
                
                // Compare adjacent elements
                if (A[j] > A[j + 1]) {
                    
                    // Swap adjacent elements
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {5,0,1,3,4,9,6,7,2,8};
        
        // Call BubbleSort method to sort the array
        BubbleSort(A);
        
        // Print the sorted array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
