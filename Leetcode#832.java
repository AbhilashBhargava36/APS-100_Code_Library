class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        for(int i=0; i< image.length; i++)
        {
            int start =0;
            int last = image.length-1;
            
            while(start<last)
            {
                int temp = image[i][start];
                image[i][start] = image[i][last];
                image[i][last] = temp;
                
                last--;
                start++;
            }
            
            for(int j=0; j<image[i].length; j++)
            {
                if(image[i][j] == 0)
                {
                    image[i][j] = 1;
                }
                else
                {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
