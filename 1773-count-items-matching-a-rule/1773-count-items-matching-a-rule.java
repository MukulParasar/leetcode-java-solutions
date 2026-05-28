class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // list.get(i).get(j)
        int itemsMatches = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    itemsMatches++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    itemsMatches++;
                }
            }
        } else if (ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    itemsMatches++;
                }
            }
        }
        return itemsMatches;
    }
}