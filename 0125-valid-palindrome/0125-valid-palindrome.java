class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            while (start < end && !isAlphaNum(arr[start])) {
                start++;
            }
            while (start<end&&!isAlphaNum(arr[end])) {
                end--;
            }
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isAlphaNum(char c) {
        return (c>='a'&&c<='z')||(c>='0'&&c<='9');
    }
}