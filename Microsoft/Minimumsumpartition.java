
class Solution
{

	public int minDifference(int A[], int n) 
	{ 
	    int sum=0;
    for(int i=0;i<n;++i)
        sum+=A[i];
    
    //Subset Sum Problem
    boolean[][] dp = new boolean[n+1][sum+1];
    for(int i=0;i<=n;++i)
    for(int j=0;j<=sum;++j)
    {
        if(j==0)
            dp[i][j] = true;
        else if(i==0)
            dp[i][j] = false;
        else if(A[i-1]>j)
            dp[i][j] = dp[i-1][j];
        else
            dp[i][j] = dp[i-1][j] || dp[i-1][j-A[i-1]];
    }
    
    int diff = Integer.MAX_VALUE;
    for(int i=0;i<=sum/2;++i)
    {
        int first = i;
        int second = sum-i;
        if(dp[n][i]==true && diff>Math.abs(first-second))
            diff = Math.abs(first-second);
    }
    
    return diff;
    }
}
	    // Your code goes here
