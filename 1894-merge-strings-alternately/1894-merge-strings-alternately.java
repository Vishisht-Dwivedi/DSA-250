class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        char[] merged = new char[w1+w2];
        if(w1<=w2){
            for(int i=0;i<w1;i++){
                merged[2*i] = word1.charAt(i);
                merged[2*i+1] = word2.charAt(i);
            }
            for(int i=0;i<w2-w1;i++){
                merged[2*w1+i] = word2.charAt(w1+i);
            }
        } else {
            for(int i=0;i<w2;i++){
                merged[2*i] = word1.charAt(i);
                merged[2*i+1] = word2.charAt(i);
            }
            for(int i=0;i<w1-w2;i++){
                merged[2*w2+i] = word1.charAt(w2+i);
            }
        }
        return new String(merged);
    }
}