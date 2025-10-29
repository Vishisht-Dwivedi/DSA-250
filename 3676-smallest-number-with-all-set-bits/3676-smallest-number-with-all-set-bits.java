class Solution {
    public int smallestNumber(int n) {
        int finalRes = 1;
        int iter = 1;
        while(n>0){
            n/=2;
            finalRes += iter*2;
            iter*=2;
        }
        return finalRes/2;
    }
}