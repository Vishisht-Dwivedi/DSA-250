class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2) return n;

        int write = 1;  // next unique write position
        int prev = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            if (curr != prev) {
                nums[write++] = curr;
                prev = curr;
            }
        }
        return write;
    }
}
