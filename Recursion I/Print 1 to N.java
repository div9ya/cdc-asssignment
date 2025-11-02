class Solution {
    static void printTillN(int N) {
        // code here
        print(1,N);
    }
    static void print(int i,int N)
    {
        if(i>N)
        {
            return;
        }
        System.out.print(i+" ");
        print(i+1,N);
    }
}
