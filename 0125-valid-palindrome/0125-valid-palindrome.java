class Solution {
    public boolean isPalindrome(String s) {
        String reduced = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(reduced.length()==0) return true;
        for(int i=0;i<reduced.length()/2;i++){
            if(reduced.charAt(i)!=reduced.charAt(reduced.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}