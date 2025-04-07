class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        for(int row=0;row<numRows;row++)
        {
            long ans=1;
            ArrayList<Integer> l = new ArrayList<>();
            l.add(1);
            for(int col=1;col<=row;col++)
            {
                ans=ans*(row-col+1)/col;
                l.add((int) ans);
            }
            al.add(l);
        }
        return al;
    }
}