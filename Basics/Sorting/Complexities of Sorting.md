## Sorting And Searching Algorithms - Time Complexities Cheat Sheet

![BigO Graph](https://github.com/GangadharYande/DSA-ProblemSolving-JAVA/assets/36783781/28030e48-a86c-4471-af3e-65bf0f786ffe)

**Correction:** Best time complexity for TIM SORT is \( O(n \log n) \).

![BigO Graph](https://github.com/GangadharYande/DSA-ProblemSolving-JAVA/assets/36783781/5d92e111-fee5-4c11-be96-65aa6cdbd60c)

---

### Bubble Sort

In Bubble Sort, the main idea is to repeatedly step through the list, compare adjacent elements, and swap them if they are in the wrong order. This process is repeated until the list is sorted.

#### Operations in Bubble Sort:

1. **Comparing Adjacent Elements**: 
    - **Operation**: Comparison
    - **Description**: 
      - Iterate through the array and compare adjacent elements.
      
2. **Swapping Elements**: 
    - **Operation**: Swap
    - **Description**: 
      - If the current element is greater than the next element, swap them.
      
3. **Moving through the Array**: 
    - **Operation**: Iteration
    - **Description**: 
      - Repeat steps 1 and 2 for each pair of adjacent elements in the array.
      
4. **Iteration**: 
    - **Operation**: Looping
    - **Description**: 
      - After completing one pass through the array, the largest unsorted element will "bubble up" to its correct position at the end of the array.
      
5. **Repeat**: 
    - **Operation**: Looping
    - **Description**: 
      - Repeat steps 1-4 for each element until the entire array is sorted.
      
6. **Termination**: 
    - **Operation**: Conditional Check
    - **Description**: 
      - The algorithm terminates when no more swaps are needed during a pass through the array, indicating that the array is sorted.

---

### Insertion Sort

Insertion Sort builds a sorted array one element at a time by inserting each element into its correct position in the already sorted part of the array.

#### Operations in Insertion Sort:

1. **Iterating through the Array**: 
    - **Operation**: Iteration
    - **Description**: 
      - Start iterating through the array, starting from the second element to the last element.
      
2. **Selecting an Element**: 
    - **Operation**: Selection
    - **Description**: 
      - Select the current element to be inserted into the sorted subarray.
      
3. **Comparing with Previous Elements**: 
    - **Operation**: Comparison
    - **Description**: 
      - Compare the selected element with the elements before it in the sorted subarray.
      
4. **Shifting Elements**: 
    - **Operation**: Shifting
    - **Description**: 
      - If the selected element is smaller than an element in the sorted subarray, shift the larger elements to the right to make space for the selected element.
      
5. **Inserting the Element**: 
    - **Operation**: Insertion
    - **Description**: 
      - Insert the selected element into its correct position in the sorted subarray.
      
6. **Repeat**: 
    - **Operation**: Looping
    - **Description**: 
      - Repeat steps 2-5 for each element in the array until the entire array is sorted.
      
7. **Termination**: 
    - **Operation**: Conditional Check
    - **Description**: 
      - The algorithm terminates when all elements have been inserted into the sorted subarray.

---

### Selection Sort

#### Operations in Selection Sort:

1. **Finding the Minimum Element**:
    - **Operation**: Comparison
    - **Description**:
      - Traverse the unsorted part of the array to find the index of the minimum element.
      - Compare each element with the current minimum element to update the minimum index if a smaller element is found.
  
2. **Swapping Elements**:
    - **Operation**: Swap
    - **Description**:
      - Once the minimum element is found in the unsorted part of the array, swap it with the first element of the unsorted part.

#### Detailed Breakdown:

1. **Initialization**:
    - **Operation**: Initialization
    - **Description**:
      - Set the `i` to 0, marking the start of the unsorted part of the array.
      - Initialize `min_idx` to `i`.

2. **For Each Pass (Outer Loop)**:

    - **Operation**: Iteration
    - **Description**: 
      - Traverse from `i + 1` to `n - 1`.
      - Compare each element `A[j]` with `A[min_idx]`.
      - If `A[j]` is smaller than `A[min_idx]`, update `min_idx` to `j`.
  
    - **Operation**: Swap
    - **Description**: 
      - If `i` is not equal to `min_idx`, swap `A[i]` and `A[min_idx]`.

3. **Termination**:

    - **Operation**: Conditional Check
    - **Description**: 
      - The process continues until the entire array is sorted, i.e., until `i` reaches `n - 1`.

4. **Overall**:
    - **Total Passes**: \( n - 1 \)
    - **Total Comparisons**:
      - \( n - 1 \) comparisons in the first pass
      - \( n - 2 \) comparisons in the second pass
      - ...
      - 1 comparison in the second last pass
      - 0 comparisons in the last pass

    - **Total Swaps**:
      - Varies based on the array's initial state but can range from 0 to \( n - 1 \).

These are the fundamental operations involved in each of the sorting algorithms. Understanding these operations can help in visualizing and implementing the algorithms more effectively.
