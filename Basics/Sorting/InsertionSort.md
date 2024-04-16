1. Iterating through the Array: Start iterating through the array, starting from the second element (index 1) to the last element (index n-1).
2. Selecting an Element: Select the current element to be inserted into the sorted subarray. This element is initially the second element in the array.
3. Comparing with Previous Elements: Compare the selected element with the elements before it in the sorted subarray.
4. Shifting Elements: If the selected element is smaller than an element in the sorted subarray, shift the larger elements to the right to make space for the selected element.
5. Inserting the Element: Insert the selected element into its correct position in the sorted subarray.
6. Repeat: Repeat steps 2-5 for each element in the array until the entire array is sorted.
7. Termination: The algorithm terminates when all elements have been inserted into the sorted subarray, resulting in a fully sorted array.

The main idea behind Insertion Sort is to build a sorted array one element at a time by inserting each element into its correct position in the already sorted part of the array. 
This process continues until the entire array is sorted.
