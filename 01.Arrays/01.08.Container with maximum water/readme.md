Description :

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Solution:

1. We need to get the maximum water stored so first we take a left and right pointers that points to 0 and nums.length -1.
2. We need to check the left and right height and if left is taller then right-- and esle left ++
   return the maxWater
