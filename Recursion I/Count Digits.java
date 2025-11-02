class Solution {
    static int evenlyDivides(int n) {
        return countFactors(n, n);
    }

    static int countFactors(int x, int n) {
        if (x == 0) return 0; 

        int digit = x % 10;
        int count = 0;

        if (digit != 0 && n % digit == 0)
            count = 1;

        return count + countFactors(x / 10, n);
    }
}
