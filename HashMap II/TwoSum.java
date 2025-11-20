class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=1;
        int sum=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            j=target-nums[i];
            if(mpp.containsKey(j))
            {
                return new int[]{i,mpp.get(j)};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
