class Solution {
    public int[] minOperations(String boxes) 
    {
        int op[] = new int[boxes.length()];
        int arr[] = new int[boxes.length()];
        
        for(int k=0; k<boxes.length(); k++)
        {
            arr[k] = boxes.charAt(k);
        }
        
        for(int i=0; i< boxes.length(); i++)
        {
            int x=0;
            for(int j=0; j<boxes.length(); j++)
            {
                if(Math.abs(i-j)>0 && arr[j] == '1')
                {
                    x = x + Math.abs(i-j);
                }
            
                op[i] = x;
            }
        }
        return op;
    }
}
