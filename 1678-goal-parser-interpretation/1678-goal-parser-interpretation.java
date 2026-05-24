class Solution {
    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                builder.append('G');
            } else if (ch == '(') {
                i++;
                ch = command.charAt(i);
                if (ch == ')') {
                    builder.append('o');
                } else {
                    builder.append("al");
                    i += 2;
                }
            }
            i++;
        }
        return builder.toString();
    }
}