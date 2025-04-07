class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int ts=1<<n;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<ts;i++)
        {
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    al.add(nums[j]);
                }
            }
            ans.add(al);
        }
        return ans;
    }
}