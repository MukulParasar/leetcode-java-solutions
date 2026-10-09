class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        int i = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() == 1) return i;
                if (helper(haystack, needle, i + 1)) return i;
            }
            i++;
        }
        return -1;
    }
    private boolean helper(String haystack, String needle, int i) {
        int j = 1;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) != needle.charAt(j)) return false;
            if (j == needle.length() - 1) return true;
            i++; j++;
        }
        return false;
    }
}