class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            if (stack.isEmpty()) {
                stack.push(intervals[i]);
            } else {
                int[] top = stack.peek();
                if (intervals[i][0] < top[1]) {
                    // Overlap found, increment count
                    count++;
                    // Keep interval with smaller end to reduce future overlaps
                    if (intervals[i][1] < top[1]) {
                        stack.pop();
                        stack.push(intervals[i]);
                    }
                    // else: keep top (do nothing)
                } else {
                    stack.push(intervals[i]);
                }
            }
        }

        return count;
    }
}
