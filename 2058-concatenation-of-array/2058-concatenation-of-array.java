class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[n*2];
        for(int i=0;i<2*n;i++){
            res[i] = nums[i%n];
        }       
        return res;
    }
}