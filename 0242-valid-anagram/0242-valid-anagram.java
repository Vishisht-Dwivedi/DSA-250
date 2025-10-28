class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] sFreq = new int[256];
        int[] tFreq = new int[256];
        for(int i=0;i<s.length();i++){
            int pos = (int)s.charAt(i);
            sFreq[pos] += 1;
        }
        for(int i=0;i<t.length();i++){
            int pos = (int)t.charAt(i);
            tFreq[pos] += 1;
        }
        for(int i=0;i<256;i++){
            if(sFreq[i]!=tFreq[i]) return false;
        }
        return true;
    }
}