import java.util.*;
public class fraction
{
    int nr,dr;
    int N,D;
    int GCD;
    fraction(int n,int d)
    {
      N = n ;
      D =  d ;
    }
    int gcd(int n,int d)
    {
        int large=0	,sm=0;int gcd=0;
        if (n <= d )
        {large =  d ;
        sm  = n ;}
        if(d <= n )
        {large = n ;
            sm = d;}
            for(int i = 1 ; i <= sm ; i++)
            {
                if(sm % i ==0 && large % i ==0 )
                 gcd = i ;
                }
            GCD=gcd;
        return gcd;}
        void simplify(int n, int d)
        {
              nr = n / GCD ;
              dr = d / GCD ;
        }
        void print()
        {
            System.out.println("the original fraction was - ");
            System.out.println(N+"/"+D);
            System.out.println(" ");
            System.out.println("the simplified fraction is - ");
            System.out.println(+nr+"/"+dr);
        }
        void main(int n,int d)
        {
             fraction ob = new fraction(n,d);
             ob.gcd(n,d);
             ob.simplify(n,d);
             ob.print();
        }
}















