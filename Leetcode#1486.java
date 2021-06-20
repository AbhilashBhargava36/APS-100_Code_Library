class Solution {
    public int xorOperation(int n, int start) {
        
        int k=0;
        int nums [] = new int [n];
        for(int i=0; i<n; i++)
        {
            nums[i] = start + 2*i;
        }
        for(int j=0; j<n; j++)
        {
            k ^= nums[j];
        }
        return k;
    }
}
