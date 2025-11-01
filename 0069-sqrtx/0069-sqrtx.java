class Solution {
    public int mySqrt(int x) {
        if (x==0||x==1) return x;
        int low = 1;
        int high = x;
        int ans = 0;
        while (low<=high) {
            long mid = low+(high-low)/2;
            long sqr = mid*mid;
            if (sqr == x) {
                return (int)mid;
            } else if(sqr<x) {
                ans = (int)mid;
                low = (int)mid+1;
            } else {
                high = (int)mid-1;
            }
        }
        return ans;
    }
}
