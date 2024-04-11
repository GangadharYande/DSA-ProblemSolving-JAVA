# Before Push Your Code - Do follow these things 
**Note that Every DSA Folder will have README.md  (Question List || Problem Statement List ).As per Questions, there will separate Folder for each Question push your code to respective folders**
- If someone already solved the  question  for eg: with file name  PrefixSum.java. Push your file similar name for eg: PrefixSum1.java
- Ignore .gitkeep file in every floder
-----------------------------------------------------------------------------------------------------------------------------------------------
<a href="https://leetcode.com/problems/two-sum/description/" target="blank"> **Question 1**</a>
**Two-Sum**

  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
  Input: nums = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
  Input: nums = [3,2,4], target = 6
  Output: [1,2]
Example 3:
  Input: nums = [3,3], target = 6
  Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists. 
<p>Complete the Following Function</p> 
  
  ```
    class Solution {
        public int[] twoSum(int[] nums, int target) {
        
        }
      }   
  ```


<a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/" target="blank">**Question 2**</a>
**Remove Duplicates from Sorted Array**

  Given an integer array nums sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums. Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums. Return k.

Example 1:
  Input: nums = [1,1,2]
  Output: 2, nums = [1,2,_]
  Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
  It does not matter what you leave beyond the returned k (hence they are underscores).
  
Example 2:
  Input: nums = [0,0,1,1,1,2,2,3,3,4]
  Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
  Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
  It does not matter what you leave beyond the returned k (hence they are underscores).
 
Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.

<p>Complete the Following Function</p> 

  ```
      class Solution {
        public int removeDuplicates(int[] nums) {
        
        }
      } 
  ```

<a href="https://leetcode.com/problems/remove-element/description/" target="blank">**Question 3**</a>
**Remove Element**

  Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val. 
  
  Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things: Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.Return k.

Example 1:

  Input: nums = [3,2,2,3], val = 3
  Output: 2, nums = [2,2,_,_]
  Explanation: Your function should return k = 2, with the first two elements of nums being 2.
  It does not matter what you leave beyond the returned k (hence they are underscores).
  
Example 2:

  Input: nums = [0,1,2,2,3,0,4,2], val = 2
  Output: 5, nums = [0,1,4,0,3,_,_,_]
  Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
  Note that the five elements can be returned in any order.
  It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100

```
class Solution {
    public int removeElement(int[] nums, int val) {
        
    }
}
```

<a href="https://leetcode.com/problems/search-insert-position/description/" target="blank">**Question 4**</a>
**Search Insert Position**

  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
  Input: nums = [1,3,5,6], target = 5
  Output: 2

Example 2:
  Input: nums = [1,3,5,6], target = 2
  Output: 1

Example 3:
  Input: nums = [1,3,5,6], target = 7
  Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

```
class Solution {
    public int searchInsert(int[] nums, int target) {
        
    }
}
```
<a href="https://leetcode.com/problems/plus-one/description/" target="blank">**Question 5**</a>
**Plus One**

  You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

  Input: digits = [1,2,3]
  Output: [1,2,4]
  Explanation: The array represents the integer 123.
  Incrementing by one gives 123 + 1 = 124.
  Thus, the result should be [1,2,4].
  
Example 2:

  Input: digits = [4,3,2,1]
  Output: [4,3,2,2]
  Explanation: The array represents the integer 4321.
  Incrementing by one gives 4321 + 1 = 4322.
  Thus, the result should be [4,3,2,2].
  
Example 3:
  Input: digits = [9]
  Output: [1,0]
  Explanation: The array represents the integer 9.
  Incrementing by one gives 9 + 1 = 10.
  Thus, the result should be [1,0].
 

Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

```
class Solution {
    public int[] plusOne(int[] digits) {
        
    }
}
```
