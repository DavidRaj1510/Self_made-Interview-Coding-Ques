class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int a=m.length;
        int b=m[0].length;
        int left=0,top=0,right=b-1,bottom=a-1;
        ArrayList<Integer> al = new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                al.add(m[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                al.add(m[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    al.add(m[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    al.add(m[i][left]);
                }
                left++;
            }
        }
        return al;
    }
}