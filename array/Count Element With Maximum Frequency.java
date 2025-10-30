class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxi=Collections.max(map.values());
        int res=0;
        for(int i:map.values())
        {
            if(i==maxi)
            {
                res+=maxi;
            }
        }
        return res;
    }
}
