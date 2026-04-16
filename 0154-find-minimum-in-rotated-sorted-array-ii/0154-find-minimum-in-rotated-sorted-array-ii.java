class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // checking for each (start, mid, end)
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (start < nums.length - 1 && nums[start] > nums[start + 1]) {
                return nums[start + 1];
            }
            if (end > 0 && nums[end - 1] > nums[end]) {
                return nums[end];
            }

            // changing indexes(start, mid, end) to reach to more nearer to the minimum and finally to the minimum element
            if (nums[start] < nums[mid]) {
                start = mid + 1;
            } else if (nums[start] > nums[mid]){
                end = mid - 1;
            } else {
                if (end > 0 && nums[end - 1] <= nums[end]) {
                    end--;
                }
            }
        }
        return nums[0];
    }
}