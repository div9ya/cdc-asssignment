class Solution {
    public int median(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[] elements=new int[n*m];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                elements[k]=mat[i][j];
                k++;
            }
        }
        Arrays.sort(elements);
        int l=0;
        int h=k;
        int mid=(h+l)/2;
        return elements[mid];
    }
}
