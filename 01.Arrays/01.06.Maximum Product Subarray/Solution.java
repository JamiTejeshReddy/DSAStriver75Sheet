public class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, mid = (left + right) / 2;
        int ans = Integer.MAX_VALUE;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[left] <= nums[mid]) {
                ans = Math.min(ans, nums[left]);
                left = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                right = mid - 1;
            }
        }
        return ans;
    }
}