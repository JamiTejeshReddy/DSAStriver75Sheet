public interface Solution {

import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Stack<int[]> stack = new Stack<>();
        int i = 0;
        boolean inserted = false;

        while (i < intervals.length) {
            if (!inserted) {
                if (newInterval[1] < intervals[i][0]) {
                    stack.push(newInterval);
                    inserted = true;
                } else if (intervals[i][1] < newInterval[0]) {
                    stack.push(intervals[i]);
                    i++;
                } else {
                    // Overlapping interval found, merge it
                    newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                    newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                    i++;
                }
            } else {
                // Merge with previous if overlapping
                int[] top = stack.peek();
                if (top[1] >= intervals[i][0]) {
                    stack.pop();
                    int mergedStart = top[0];
                    int mergedEnd = Math.max(top[1], intervals[i][1]);
                    stack.push(new int[] { mergedStart, mergedEnd });
                } else {
                    stack.push(intervals[i]);
                }
                i++;
            }
        }

        // If newInterval hasn't been inserted yet (it goes at the end)
        if (!inserted) {
            stack.push(newInterval);
        }

        // Convert to array in correct order
        List<int[]> list = new ArrayList<>();
        for (int[] interval : stack) {
            list.add(interval);
        }

        return list.toArray(new int[list.size()][]);
    }
}

}
