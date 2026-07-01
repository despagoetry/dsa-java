class Solution {
    public int smallestNumber(int n) {
        int x = 1;
        while(true){
            int ans = 1 << x;
            if(ans > n){
                return ans-1;
            }
            x+=1;
        }
    }
}