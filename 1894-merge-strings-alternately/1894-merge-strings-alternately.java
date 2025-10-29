class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        char[] merged = new char[w1 + w2];
        int i=0,j=0,k=0;
        while (i<w1||j<w2) {
            if (i<w1) merged[k++] = word1.charAt(i++);
            if (j<w2) merged[k++] = word2.charAt(j++);
        }
        return new String(merged);
    }
}
