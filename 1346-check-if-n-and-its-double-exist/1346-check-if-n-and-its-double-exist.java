class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 0);
        for (int i = 1; i < arr.length; i++) {
            if (map.containsKey(arr[i] * 2)) {
                return true;
            }
            else if (map.containsKey(arr[i] / 2) && arr[i] % 2 == 0) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}