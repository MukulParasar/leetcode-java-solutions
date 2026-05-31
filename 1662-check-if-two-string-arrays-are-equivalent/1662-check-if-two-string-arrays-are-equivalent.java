class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        for (String w : word1) {
            w1.append(w);
            System.out.println(w);
            System.out.println(w1);
        }
        StringBuilder w2 = new StringBuilder();
        for (String w : word2) {
            w2.append(w);
            System.out.println(w);
            System.out.println(w2);
        }
        System.out.println(w1 + " & " + w2);
        if (w1.toString().equals(w2.toString())) {
            return true;
        }
        return false;
    }
}