class Solution {
    public String toLowerCase(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch = 32 + ch;
            }
            char c = (char) ch;
            builder.append(c);
        }
        return builder.toString();
    }
}