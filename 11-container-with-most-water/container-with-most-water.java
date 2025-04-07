class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1,maxcap=0;
        while(start<end)
        {
            int h=Math.min(height[start],height[end]);
            int w=end-start;
            int curcap=h*w;
            maxcap=Math.max(curcap,maxcap);
            if(height[start]<height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return maxcap;
    }
}