class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ans = new int[n + 1];
        boolean gnum = true;
        for(int i = n - 1; gnum == true && i > -1 ;  i--){
            int x = digits[i] + 1;
            if(x==10){
                digits[i]=0;
                gnum = true;
            }else{
                digits[i]=x;
                gnum = false;
            }
        }
        if(gnum == true){
            ans[0]=1;
            for(int i = 1; i < ans.length ; i++){
                ans[i]=digits[i-1];
            }
            return ans;
        }else{
            return digits;
        }
    }
}
