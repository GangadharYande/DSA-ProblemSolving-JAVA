## Sorting And Searching Algorithms - Time Complexities Cheat Sheet
![c950295](https://github.com/GangadharYande/DSA-ProblemSolving-JAVA/assets/36783781/28030e48-a86c-4471-af3e-65bf0f786ffe)

**BigO Graph**

![317c55e](https://github.com/GangadharYande/DSA-ProblemSolving-JAVA/assets/36783781/5d92e111-fee5-4c11-be96-65aa6cdbd60c)

***Correction:- Best time complexity for TIM SORT is O(nlogn)**

## Bubble Sort
In Bubble Sort, the main idea is to repeatedly step through the list, compare adjacent elements, and swap them if they are in the wrong order. This process is repeated until the list is sorted.

Here's a high-level idea of the operations involved in Bubble Sort:

1. Comparing Adjacent Elements: Iterate through the array and compare adjacent elements.
2. Swapping Elements: If the current element is greater than the next element, swap them.
3. Moving through the Array: Repeat steps 1 and 2 for each pair of adjacent elements in the array.
4. Iteration: After completing one pass through the array, the largest unsorted element will "bubble up" to its correct position at the end of the array.
5. Repeat: Repeat steps 1-4 for each element until the entire array is sorted.
6. Termination: The algorithm terminates when no more swaps are needed during a pass through the array, indicating that the array is sorted.
This process continues until the array is sorted, with each pass through the array resulting in at least one element being placed in its correct position. Eventually, after enough passes, the entire array becomes sorted.

## Insertion Sort

1. Iterating through the Array: Start iterating through the array, starting from the second element (index 1) to the last element (index n-1).
2. Selecting an Element: Select the current element to be inserted into the sorted subarray. This element is initially the second element in the array.
3. Comparing with Previous Elements: Compare the selected element with the elements before it in the sorted subarray.
4. Shifting Elements: If the selected element is smaller than an element in the sorted subarray, shift the larger elements to the right to make space for the selected element.
5. Inserting the Element: Insert the selected element into its correct position in the sorted subarray.
6. Repeat: Repeat steps 2-5 for each element in the array until the entire array is sorted.
7. Termination: The algorithm terminates when all elements have been inserted into the sorted subarray, resulting in a fully sorted array.

The main idea behind Insertion Sort is to build a sorted array one element at a time by inserting each element into its correct position in the already sorted part of the array. 
This process continues until the entire array is sorted.
