class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int sr = source[0], sc = source[1];
        int tr = target[0], tc = target[1];
        if (sr == tr && sc == tc) return 0;
        if (Math.abs(tr - sr) == Math.abs(tc - sc) || sr == tr || sc == tc) return 1;
        else return 2;
    }
}