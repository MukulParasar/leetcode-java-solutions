import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] a : reservedSeats) {
            map.putIfAbsent(a[0], new HashSet<Integer>());
            map.get(a[0]).add(a[1]);
        }
        int ans = (n - map.size()) * 2;
        for (int row : map.keySet()) {
            Set<Integer> s = map.get(row);
            boolean left = true;
            boolean middle = true;
            boolean right = true;
            for (int t : s) {
                if (t >= 2 && t <= 5) left = false;
                if (t >= 4 && t <= 7) middle = false;
                if (t >= 6 && t <= 9) right = false;
            }
            if (left && right) {
                ans += 2;
            } else if (left || middle || right) {
                ans += 1;
            }
        }
        return ans;
    }
}