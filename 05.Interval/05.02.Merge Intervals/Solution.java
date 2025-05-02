class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack();
        int i = 0;
        while (i < intervals.length) {
            if (stack.isEmpty()) {
                stack.push(intervals[i]);
                i++;
            } else {
                int[] top = stack.peek();
                if (intervals[i][0] <= top[1] && intervals[i][0] >= top[0]) {
                    stack.pop();
                    stack.push(new int[] { top[0], Math.max(top[1], intervals[i][1]) });
                } else {
                    stack.push(intervals[i]);
                }
                i++;
            }
        }
        int[][] ans = new int[stack.size()][2];
        int j = stack.size() - 1;
        while (!stack.isEmpty()) {
            ans[j] = stack.pop();
            j--;
        }
        return ans;
    }
}