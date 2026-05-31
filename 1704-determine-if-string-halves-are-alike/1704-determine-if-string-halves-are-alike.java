class Solution {
    public boolean halvesAreAlike(String s) {
        int vS1 = 0;
        int vS2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i < s.length() / 2 && isVowel(ch)) {
                vS1++;
            } else if (i >= s.length() / 2 && isVowel(ch)) {
                vS2++;
            }
        }
        return vS1 == vS2;
    }
    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }
}