class Solution {
    public int missingNumber(int[] nums) {
        int[] index = new int[nums.length + 1];
        for (int i : nums) {
            index[i] = -1;
        }
        for (int i = 0; i <= nums.length; i++) {
            if (index[i] != -1)
                return i;
        }
        return -1;
    }
}
