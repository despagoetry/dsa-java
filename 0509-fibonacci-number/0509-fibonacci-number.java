class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacciSeq(n);
        }
    }
    public int fibonacciSeq(int n){
        int i = 0;
        int j = 1;
        for(int a = 2; a <= n; a++){
            int temp = i + j;
            i = j;
            j = temp;
        }
        return j;
    }
}