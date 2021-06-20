class Solution {
    public int[] decompressRLElist(int[] nums) 
    {
        int sum=0;
        for(int p=0; p<nums.length; p+=2)
            {
                sum += nums[p];
            }
        int arr[] = new int[sum];
        int k=0;
        for(int i=0; i< nums.length; i+=2)
        {
            for(int j=0; j<nums[i]; j++)
            {
                arr[k] = nums[i+1];
                k++;
            }
        }
        return arr;
    }
}
