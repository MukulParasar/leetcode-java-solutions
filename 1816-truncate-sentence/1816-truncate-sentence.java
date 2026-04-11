class Solution {
    public String truncateSentence(String s, int k) {
        String[] arrS = s.split(" ");
        StringBuilder sb = new StringBuilder(arrS[0]);
        for (int i = 1; i < k; i++) {
            sb.append(" ");
            sb.append(arrS[i]);
        }
        String toReturn = sb.toString();
        return toReturn;
    }
}