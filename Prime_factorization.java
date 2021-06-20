

public class PrimeFactorization
{
   void main(int n)
   {
       int i;
       for(i=2;i<=n;)
       {
           if(n%i==0)
           {
               System.out.print(i+",");
               n=n/i;
            }
            else
              i++;
       }
    }
}
