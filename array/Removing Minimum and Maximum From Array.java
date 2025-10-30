class Solution {
    public int minimumDeletions(int[] nums) {
        int maxi=nums[0],mini=nums[0],posMax=0,posMin=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>maxi)
            {
                maxi=nums[i];
                posMax=i;
            }
            if(nums[i]<mini)
            {
                mini=nums[i];
                posMin=i;
            }
        }
        int x=Math.min(posMax+1,n-posMax);
        int y=Math.min(posMin+1,n-posMin);
        int p1=x,p2=y;
        if(p2<p1)
        {
            p2=x;
            p1=y;
        }
        p2=Math.min(p2,Math.abs(posMax-posMin));
        return p1+p2;
    }
}
