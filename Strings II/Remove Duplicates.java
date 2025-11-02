class Solution {
    String removeDuplicates(String s) {
        String res="";
        for(char ch:s.toCharArray())
        {
            if(res.indexOf(ch)==-1)
            {
                res=res+ch;
            }
        }
        return res;
    }
}
