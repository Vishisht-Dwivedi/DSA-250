class Solution {
    public int smallestNumber(int n) {
        int iter = 0;
        int finalRes = 0;
        while(n>0){
            n/=2;
            finalRes+=Math.pow(2,iter);
            iter++;
        }
        return finalRes;
    }
}