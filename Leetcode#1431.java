class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List res = new ArrayList<>();
        int max = candies[0];
        int count=0;
        for(int i=1; i<candies.length ; i++)
        {
          if(candies[i] >= max)
          {
              max = candies[i];
          }
        }
        
        for(int j=0; j<candies.length; j++)
        {
            count = candies[j] + extraCandies;

         if(count >= max)
        {
            res.add(true);
        }
        else{
            res.add(false);
        }  
        }
          
        return res;
    }
    
}
