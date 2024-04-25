/* 
Given a binary search tree A, where each node contains a positive integer, and an integer B, you have to find whether or not there exist two different nodes X and Y such that X.value + Y.value = B.

Return 1 to denote that two such nodes exist. Return 0, otherwise.



Problem Constraints
1 <= size of tree <= 100000

1 <= B <= 109



Input Format
First argument is the head of the tree A.

Second argument is the integer B.



Output Format
Return 1 if such a pair can be found, 0 otherwise.



Example Input
Input 1:

         10
         / \
        9   20

B = 19
Input 2:

 
          10
         / \
        9   20

B = 40


Example Output
Output 1:

 1
Output 2:

 0
*/
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
   
    int ans = 0;
    public int t2Sum(TreeNode A, int B) {
            traverse(A,B,A);
            return ans;
    }

    void traverse(TreeNode A,int B,TreeNode root){
        if(A == null){
            return;
        }
        int target = B - A.val;
        TreeNode found = search(root,target);
        if(Objects.nonNull(found) && !Objects.equals(found,A)){
            ans = 1;
        }
        traverse(A.left,B,root);
        traverse(A.right,B,root);
    }
    TreeNode search(TreeNode A ,int target){
        TreeNode pnt  = A;
        while(pnt != null){
        if(target < pnt.val){
            pnt = pnt.left;
        }
        else if(target > pnt.val){
            pnt = pnt.right;
        }
        else if(pnt.val == target){
            return pnt;
        }
        }
        return null;

       
    }

}
