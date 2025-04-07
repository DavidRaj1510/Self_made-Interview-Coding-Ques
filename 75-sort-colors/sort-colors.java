class Solution {
    public void sortColors(int[] ans) {
        int zc=0,oc=0,tc=0;
        int index=0;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]==0)
            {
                zc++;
            }
            else if(ans[i]==1)
            {
                oc++;
            }
            else tc++;
        }
        while(zc>0)
        {
            ans[index]=0;
            index++;
            zc--;
        }
        while(oc>0)
        {
            ans[index]=1;
            index++;
            oc--;
        }
        while(tc>0)
        {
            ans[index]=2;
            index++;
            tc--;
        }
    }
}