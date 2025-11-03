class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int sum1=0,left=0;
        while(left<nums.length)
        {
            sum-=nums[left];
            if(sum==sum1)
            return left;
            sum1+=nums[left];
            left++;
        }
        return -1;
    }
}
