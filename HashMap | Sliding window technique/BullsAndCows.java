class Solution {
    public String getHint(String secret, String guess) {
        Map<Character,List<Integer>> mpp=new HashMap<>();
        for(int i=0;i<secret.length();i++)
        {
            char ch=secret.charAt(i);
            mpp.computeIfAbsent(ch, k -> new ArrayList<>()).add(i);
        }
        int x=0;
        int y=0;
        for(int i=0;i<guess.length();i++)
        {
            char ch=guess.charAt(i);
            if(mpp.containsKey(ch))
            {
                List<Integer> list=mpp.get(ch);
                if(list.contains(i))
                {
                    list.remove(Integer.valueOf(i));
                    mpp.put(ch,list);
                    x++;
                }
            }
        }
        for(int i=0;i<guess.length();i++)
        {
            char ch=guess.charAt(i);
            if(!mpp.containsKey(ch))
            continue;
            List<Integer> list=mpp.get(ch);
            if(!list.contains(i)&&secret.charAt(i)==guess.charAt(i))
            {
                continue;
            }
            if(!list.isEmpty())
            {
                list.remove(0);
                y++;
            }
        }
        return x+"A"+y+"B";
    }
}
