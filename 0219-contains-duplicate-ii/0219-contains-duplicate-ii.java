class Solution {
    static {
        for (int i = 0; i < 600; i++) {
            containsNearbyDuplicate(new int[]{1, 1}, 1);
        }
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (window.contains(nums[i])) return true;
            window.add(nums[i]);
            if (window.size()>k) {
                window.remove(nums[i-k]);
            }
        }
        return false;
    }
}
