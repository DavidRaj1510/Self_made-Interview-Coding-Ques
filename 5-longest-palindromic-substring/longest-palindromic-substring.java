class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";  
        String longestPalindrome = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) { 
                if (isPalindromic(s, i, j)) {  
                    int length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        longestPalindrome = s.substring(i, j + 1);
                    }
                }
            }
        }
        return longestPalindrome;
    }
    private boolean isPalindromic(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
