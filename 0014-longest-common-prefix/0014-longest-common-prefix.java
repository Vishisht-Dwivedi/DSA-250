class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen=201;
        if (strs.length==1) {
            return strs[0];
        }
        for (int i=0;i<strs.length;i++) {
            minLen = Math.min(strs[i].length(), minLen);
        }
        if (minLen == 0) {
            return "";
        }
        for (int i=0;i<minLen;i++) {
            char toMatch = strs[0].charAt(i);
            for (int j=0; j<strs.length; j++) {
                if (toMatch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }
}
