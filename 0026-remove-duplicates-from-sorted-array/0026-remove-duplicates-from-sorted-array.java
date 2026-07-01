class Solution {
    public int removeDuplicates(int[] arr) {
        int j = 1;
		int k = 1;
		for(int i = 0; j < arr.length; j++) {
			if(arr[i] < arr[j]) {
				arr[i+1]= arr[j];
				k++;
				i++;
			}
		}
		return k;
    }
}