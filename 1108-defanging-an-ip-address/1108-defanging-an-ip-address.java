class Solution {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                builder.append("[.]");
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}