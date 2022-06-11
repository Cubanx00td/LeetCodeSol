class Solution {
    public int climbStairs(int n) {
        int[] stairs = new int[n + 1];
        stairs[0] = 1; // this is the groud before climbing stairs
        stairs[1] = 1; // for stair 1, only one way (1 step)
        for(int i = 2; i <= n; i++){
            //two ways: 1 step from stairs[i-1] or 2 steps from stairs[i-1];
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }
}
