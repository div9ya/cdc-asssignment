class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int prev=Integer.MIN_VALUE;
        int count=0;
        int maxCount=0;
        for(int num:set)
        {
            if(num==prev+1)
            {
                count+=1;
            }
            else
            {
                count=1;
            }
            maxCount=Math.max(maxCount,count);
            prev=num;
        }
        return maxCount;
    }
}
