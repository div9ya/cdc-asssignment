class Solution {
    public int reverseExponentiation(int n) {
        // code here
        if(n<10)
        {
            return (int)Math.pow(n,n);
        }
        int rev=reverse(n);
        return (int)Math.pow(n,rev);
    }
    public int reverse(int n )
    {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
