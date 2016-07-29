public class Solution {
    public int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int nMinusOne = 1; 
        int nMinusTwo = 0;
        int res = 0;
        for(int i = 2; i <= n ;i++){
            res = nMinusOne + nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = res;
        }
        return res;
    }
}