class Solution {
    void selectionSort(int[] arr) {
        // code here
        int min,pos,n=arr.length;
        for(int i=0;i<n;i++)
            {
            min=arr[i];
            pos=i;
            for(int j=i+1;j<n;j++)
                {
                if(arr[j]<min)
                    {
                        min=arr[j];
                        pos=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }
        }
    }
