class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        Map<Character,Integer> mpp=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        int maxi=0;
        char m='a';
        for(Map.Entry<Character,Integer> entry:mpp.entrySet())
        {
            char key=entry.getKey();
            int value=entry.getValue();
            if(value>=maxi)
            {
                if(maxi==value)
                {
                    m=(m>key)?key:m;
                }
                else
                {
                    m=key;
                    maxi=value;
                }
            }
        }
        return m;
    }
}
