class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lptr1 = m-1;
        int lptr2 = n-1;
        int lptr = m + n - 1;
        while(lptr1>=0 || lptr2>=0){
            if(lptr2<0){
                while(lptr1>=0){
                    nums1[lptr] = nums1[lptr1];
                    lptr1--;
                    lptr--;
                }
            } else if (lptr1<0){
                while(lptr2>=0){
                    nums1[lptr] = nums2[lptr2];
                    lptr2--;
                    lptr--;
                }
            } else {
                if(nums1[lptr1]>=nums2[lptr2]){
                    nums1[lptr] = nums1[lptr1];
                    lptr--;
                    lptr1--;
                } else {
                    nums1[lptr] = nums2[lptr2];
                    lptr--;
                    lptr2--;
                }
            }
        }
    }
}