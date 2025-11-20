class Solution {
    public boolean isAnagram(String s, String t) {
         Map<Character,Integer> count=new HashMap<>();
         for(char x : s.toCharArray())
         {
            count.put(x,count.getOrDefault(x,0)+1);
         }
         for(char x : t.toCharArray())
         {
            count.put(x,count.getOrDefault(x,0)-1);
         }
         for(int x:count.values())
         {
            if(x!=0)
            return false;
         }
         return true;
    }
}
