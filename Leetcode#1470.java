class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int [] arr = new int[2*n];
        for(int i=0,j=1; i<n && j<2*n; i++,j+=2)
        {
            arr[2*i] = nums[i];
            arr[j] = nums[n+i];
        }
        return arr;
        
    }
}
