class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1 + n2;
        int i = 0, j = 0;
        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int count = 0;
        int ind1El = -1, ind2El = -1;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (count == ind1) ind1El = nums1[i];
                if (count == ind2) ind2El = nums1[i];
                count++;
                i++;
            } else {
                if (count == ind1) ind1El = nums2[j];
                if (count == ind2) ind2El = nums2[j];
                count++;
                j++;
            }
            if (ind1El != -1 && ind2El != -1) {
                break;
            }
        }
        while (i < n1) {
            if (count == ind1) ind1El = nums1[i];
            if (count == ind2) ind2El = nums1[i];
            count++;
            i++;
            if (ind1El != -1 && ind2El != -1) {
                break;
            }
        }
        while (j < n2) {
            if (count == ind1) ind1El = nums2[j];
            if (count == ind2) ind2El = nums2[j];
            count++;
            j++;
            if (ind1El != -1 && ind2El != -1) {
                break;
            }
        }
        if (n % 2 == 1) {
            return ind2El;
        } else {
            return (double) ((double) (ind1El + ind2El)) / 2.0;
        }
    }
}