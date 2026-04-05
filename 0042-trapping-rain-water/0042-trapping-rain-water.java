class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int maxL = 0;
        int[] right = new int[height.length];
        int maxR = 0;
        for (int i = 0; i < left.length; i++) {
            maxL = Math.max(maxL, height[i]);
            left[i] = maxL;
        }
        for (int i = right.length - 1; i >= 0; i--) {
            maxR = Math.max(maxR, height[i]);
            right[i] = maxR;
        }
        // calculate water trap
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(left[i], right[i]);
            int currWater = min - height[i];
            water = water + currWater;
        }
        return water;
    }
}