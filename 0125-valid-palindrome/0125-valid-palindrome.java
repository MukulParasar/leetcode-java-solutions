class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        String st = s.replaceAll("[^a-zA-Z0-9]", "");
        String str = st.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}