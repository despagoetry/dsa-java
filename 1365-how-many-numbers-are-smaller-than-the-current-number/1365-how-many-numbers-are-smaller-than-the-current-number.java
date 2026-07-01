class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
    int arr[] = new int[nums.length];

        for(int i = 0 ; i < arr.length ; i++){
        int k = 0;

            for(int j = 0 ; j < arr.length ; j++){
                if(i!=j && nums[i]>nums[j]){
                    k++;
                }
            }
            arr[i] = k;
        }
        return arr;
    }

}