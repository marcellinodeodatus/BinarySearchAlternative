Adapted Binary Search using Interpolation

The method is similar to binary search but uses interpolation to estimate the index to check, rather than always going for the midpoint. 
Interpolation assumes that the values are evenly distributed, and uses the following formula to calculate the next position to check:

Position = low + ((target - values[low])/(values[high] - values[low]) x (high - low))

Explanation:
1. Pre-conditions: The array is sorted in ascending order and contains NO repeated elements.
2. Interpolation formula: This formula estimates the position by comparing the target with the range between values[low] and values[high].
3. Termination: The loop runs until the low index exceeds high or the target is found. If the target is not within the range, it returns -1.

Worst-Case Running Time:
In a Worst-case scenario, when interpolation fails to reduce the search space effectively (for example, if the data is not uniformly distributed or clustered towards one end), the running time can degrade to O(n), as the algorithm would have to traverse all elements sequentially in the worst-case.

a) Worst-case running time: If repeated values are allowed, interpolation might end up checking every element in the array, similar to linear search. This would give a time complexity of O(n) in the worst case.

b) Data that could cause worst-case running time: Data that is unevenly distributed can cause interpolation to make poor guesses about where to search next.
example: int[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100};
In this case, the interpolation search might consistently make poor estimates, forcing the algorithm to perform almost like a linear search.
