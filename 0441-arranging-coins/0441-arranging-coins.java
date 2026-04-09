class Solution {
    public int arrangeCoins(int n) {
        // int start = 0;
        // int end = 1;
        int row = 0;
        int toCut = 1;
        while(n >= toCut) {
            n = n - toCut;
            row++;
            toCut++;
        }
        return row;
    }
}