class Solution {
    public int maxProfit(int[] arr) {
        if(arr.length==0) return 0;
        int obsp=-arr[0];  //old bought state profit(having extra share)
        int ossp=0;        //old sold state profit(no extra share)
        int ocsp=0;        //old cooldown state profit
        
        
        for(int i=0;i<arr.length;i++){
            int nbsp=0;  //new bought state profit
            int nssp=0;  //new sold state profit
            int ncsp=0;  //new cooldown sate profit
            
            //calculating new bought state profit
            if(ocsp-arr[i]>obsp){
                nbsp=ocsp-arr[i];
            
        }
        else{
            nbsp=obsp;
        }
            //calculating new sold state profit
            if(obsp+arr[i]>ossp){
                nssp=obsp+arr[i];
            }
            else{
                nssp=ossp;
            }
            
            //calculating new cooldown state profit
            if(ossp>ocsp){
                ncsp=ossp;
            }
            else{
                ncsp=ossp;
            }
            
            obsp=nbsp;
            ossp=nssp;
            ocsp=ncsp;
        }
        return ossp;   //max profit will be in sold state only (i.e equal number of buying and selling of stocks should be there)
    }
}
