Description :
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Solution:
We have a list of sorted integers and they are rotated in any order so we need to find the index of target and if not present return -1 in O(log(N)) comlexity

Hint: We need to use Binary search for searching the element

1. First element as left and last element as right and mid is the mid element of left and right.
2. we have two sub arrrays left -> left to mid and right -> roight to mid
3. one of them must be sorted so we will check if the target is present in the sorted array if not then we will ignore the sorted subarrray and move left or right accordingly.
