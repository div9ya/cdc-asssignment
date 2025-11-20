class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> mpp=new HashMap<>();
        int x=0;
        for(int num:nums)
        {
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(int i=0;i<=n;i++)
        {
           if(!mpp.containsKey(i))
           {
                x=i;
                break;
           }
        }
        return x;
    }
}
