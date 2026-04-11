class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int noOfBars = 0;
        int sum = 0;
        for (int cost : costs) {
            if (sum + cost > coins) {
                return noOfBars;
            }
            sum += cost;
            noOfBars++;
        }
        return noOfBars;
    }
}