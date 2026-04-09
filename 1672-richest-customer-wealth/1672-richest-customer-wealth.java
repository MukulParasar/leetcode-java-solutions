class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealthOfRichestCustomer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealthOfCurrentCustomer = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealthOfCurrentCustomer = wealthOfCurrentCustomer + accounts[i][j];
            }
            if (wealthOfRichestCustomer < wealthOfCurrentCustomer) {
                wealthOfRichestCustomer = wealthOfCurrentCustomer;
            }
        }
        return wealthOfRichestCustomer;
    }
}