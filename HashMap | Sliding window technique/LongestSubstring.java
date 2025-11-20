class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        Set<Character> set=new HashSet<>();
        int left=0;
        int maxCount=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left+=1;
            }
            set.add(ch);
            maxCount=Math.max(maxCount,right-left+1);
        }
        return maxCount;
    }
}
