class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,p[i]);
            max=Math.max(max,p[i]-min);
        }
        return max;
    }
}