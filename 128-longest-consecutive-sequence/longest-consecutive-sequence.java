class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest=1;
        if(n==0) return 0;
        //First Removing duplicates using set
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for(int num : nums)
        {
            s.add(num);
        }
        
        for(int num : s)
        {
            //For each num in set,if set not contains num-1,then store currnum = num, make c=1
            if(!s.contains(num-1))
            {
                int currnum=num;
                int c=1;
                //If set contain num+1, them increment num=num+1, c=c+1
                while(s.contains(num+1))
                {
                    num++;
                    c++;
                }
                //Find the longest sequence count
                longest=Math.max(longest,c);
            }
        }
        return longest;//return longest sequence count
    }
}