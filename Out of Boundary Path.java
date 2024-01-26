/*
There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. 
You are allowed to move the ball to one of the four adjacent cells in the grid 
(possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.
Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball
out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.

Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
Output: 6
*/

class Solution {
    int mod = (int)Math.pow(10,9) + 7;
    int M, N;
   /* 
    List<List<Integer>> direction = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList(0,1));
        new ArrayList<>(Arrays.asList(0,-1));
        new ArrayList<>(Arrays.asList(1,0));
        new ArrayList<>(Arrays.asList(-1,0));
    ));*/
    int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    int[][][] dp = new int[51][51][51];

    public int solve(int sr, int sc, int maxMove){
        if(sr < 0 || sr >= M || sc < 0 || sc >= N){
            return 1;  // found one path of grid
        }
        if(maxMove <= 0){
            return 0;
        }
        if(dp[sr][sc][maxMove] != -1){
            return dp[sr][sc][maxMove];
        }
        int result = 0;
        for(int[] dir : direction){
            int newRow = sr +  dir[0];
            int newCol = sc + dir[1];
             
            result = (result + solve(newRow,newCol, maxMove - 1)) % mod;
        }
        return dp[sr][sc][maxMove]  = result;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        M = m;
        N = n;
        for(int i = 0; i < 51; i++){
            for(int j = 0; j < 51; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(startRow,startColumn,maxMove);
    }
}
