class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        //here i performed breaking, when i<i+1 and storing i in index
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        //for outofbound -1 Exception i put index!=-1, then i swap the ele which is greater than index ele but less than other ele
        if(index!=-1)
        {
            for(int i=n-1;i>index;i--)
            {
                if(nums[i]>nums[index])
                {
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
        }
        //Now from index+1 to n-1 i perform reversing the array
        int left=index+1,right=n-1;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}