class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int lastLen = 0;
        int i = str.length() - 1;
        while (i >= 0) {
            char ch = str.charAt(i);
            if (ch == ' ') return lastLen;
            lastLen++;
            i--;
        }
        return lastLen;
    }
}