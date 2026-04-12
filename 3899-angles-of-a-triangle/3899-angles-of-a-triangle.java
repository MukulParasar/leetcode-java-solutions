class Solution {
    public double[] internalAngles(int[] sides) {
        double[] side = new double[3];
        double[] angles = new double[3];
        if (sides[0] + sides[1] > sides[2] && sides[1] + sides[2] > sides[0] && sides[2] + sides[0] > sides[1]) {
            for (int i = 0; i < 3; i++) {
                side[i] = sides[i];
            }
            double c2 = Math.acos((side[0] * side[0] + side[1] * side[1] - side[2] * side[2]) / (2 * side[0] * side[1]));
            double b1 = Math.acos((side[2] * side[2] + side[0] * side[0] - side[1] * side[1]) / (2 * side[2] * side[0]));
            double a0 = Math.acos((side[1] * side[1] + side[2] * side[2] - side[0] * side[0]) / (2 * side[1] * side[2]));
            angles[0] = Math.toDegrees(a0);
            angles[1] = Math.toDegrees(b1);
            angles[2] = Math.toDegrees(c2);
            Arrays.sort(angles);
            return angles;
        }
        return new double[0];
    }
}