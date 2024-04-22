/*  https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1

      Given a 2D binary matrix(1-based indexed) a of dimensions nxm , determine the row that contains the minimum number of 1's.
Note: The matrix contains only 1's and 0's. Also, if two or more rows contain the minimum number of 1's, the answer is the lowest of those indices. 

Input:
n = 4,m = 4
a = [[1, 1, 1, 1],
     [1, 1, 0, 0], 
     [0, 0, 1, 1],
     [1, 1, 1, 1]]
Output:
2
Explanation:
Rows 2 and 3 contain the minimum number 
of 1's(2 each).Since,row 2 is less than row 3.
Thus, the answer is 2.

You don't need to read input or print anything. 
Your task is to complete the function minRow() which takes the two integers n, m as well as the 2D binary matrix a as 
input parameters and returns the minimum index of the row which contains the least number of 1's.

Expected Time Complexity:O(n*m)
Expected Auxillary Space:O(1)
*/

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int minOnes = Integer.MAX_VALUE;
        int minRowIdx = -1;

        for (int i = 0; i < n; i++) {
            int onesCount = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount < minOnes) {
                minOnes = onesCount;
                minRowIdx = i + 1; // 1-based index
            }
        }
        
        return minRowIdx;
    }
};
