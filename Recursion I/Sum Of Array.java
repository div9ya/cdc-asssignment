class Solution {
    int arraySum(int arr[]) {
        // code here
        return sum(0,arr);
    }
    int sum(int i,int[] arr)
    {
        if(i>arr.length)
        return 0;
        return arr[i]+sum(i+1,arr);
    }
}
