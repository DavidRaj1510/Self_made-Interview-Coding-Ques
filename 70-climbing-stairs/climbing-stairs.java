class Solution {
    public int climbStairs(int n) {
        int f=0,s=1;
        for(int i=0;i<n;i++)
        {
            int temp=f;
            f=s;
            s=temp+f;
        }
        return s;
    }
}