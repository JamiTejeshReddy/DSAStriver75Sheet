class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = (left + right) / 2, ans = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {// If left subarray is sorted ascending
                if (nums[mid] <= target && nums[right] >= target) {
                    return binarySearch(nums, mid, right, target);
                }
                right = mid - 1;
            } else {
                if (nums[left] <= target && nums[mid] >= target) {
                    return binarySearch(nums, left, mid, target);
                }
                left = mid + 1;
            }
        }
        return -1;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}