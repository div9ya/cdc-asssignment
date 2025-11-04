// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int m=arr.length;
        int n=arr[0].length;
        int maxi=Integer.MIN_VALUE;
        int pos=-1;
        for(int i=0;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                count+=1;
            }
            if(maxi<count)
            {
                maxi=count;
                pos=i;
            }
        }
        return pos;
    }
}
