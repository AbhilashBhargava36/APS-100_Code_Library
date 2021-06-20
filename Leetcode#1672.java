class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int i=0,j=0,count=0;
        int m = accounts.length;
        int n = accounts[i].length;
        for(i=0; i< m; i++)
        {
            int sum = 0;
            for(j=0; j<n; j++)
            {
                sum +=accounts[i][j];
            }
        if(sum>count)
        {
            count = sum;
        }
        }
        return count;
    }
}
