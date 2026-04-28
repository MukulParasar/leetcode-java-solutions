class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> toReturn = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<Integer> list;
        if (n1 < n2) {
            list = new ArrayList<>(nums2.length);
            for (int a2 : nums2) {
                list.add(a2);
            }
            for (int a1 : nums1) {
                if (list.contains(a1) && !toReturn.contains(a1)) toReturn.add(a1);
            }
        } else {
            list = new ArrayList<>(nums1.length);
            for (int a1 : nums1) {
                list.add(a1);
            }
            for (int a2 : nums2) {
                if (list.contains(a2) && !toReturn.contains(a2)) toReturn.add(a2);
            }
        }
        int[] returnable = new int[toReturn.size()];
        for (int i = 0; i < toReturn.size(); i++) {
            returnable[i] = toReturn.get(i);
        }
        return returnable;
    }
}