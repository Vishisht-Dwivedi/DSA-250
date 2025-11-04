class Solution {
    public void sortColors(int[] nums) {
        int zeroPtr = 0;
        int mid = 0;
        int twoPtr = nums.length - 1;
        while (mid <= twoPtr){
            if (nums[mid]==0){
                nums[mid] = nums[zeroPtr];
                nums[zeroPtr] = 0;
                zeroPtr++;
                mid++;
            } else if (nums[mid]==1){
                mid++;
            } else {
                nums[mid] = nums[twoPtr];
                nums[twoPtr] = 2;
                twoPtr--;
            }
        }
    }
}
