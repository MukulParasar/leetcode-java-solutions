class Solution {
    public String sortSentence(String s) {
        String[] word = s.split(" ");
        String[] sentence = new String[word.length];
        for (String w : word) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < w.length() - 1; i++) {
                builder.append(w.charAt(i));
            }
            sentence[(w.charAt(w.length() - 1) - '0') - 1] = builder.toString();
        }
        String senten = String.join(" ", sentence);
        return senten;
    }
}