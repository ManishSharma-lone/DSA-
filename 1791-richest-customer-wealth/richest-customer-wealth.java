class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = Integer.MIN_VALUE;
        int sum=0;
       for(int row=0;row<accounts.length;row++){
        for(int col = 0;col<accounts[row].length;col++){
           sum +=accounts[row][col];
        }
        res = Math.max(res,sum);
        sum=0;
       }
       return res; 
    }
}