
import java.util.*;
public class FindBases
{
    // instance variables - replace the example below with your own
    int x,y;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two positive integers ");
        x = in.nextInt();
        y = in.nextInt();
    }
    int convert(int n, int b)
    {
        int c=1,s=0,r;
        while(n!=0)
        {
            r = n%10;
            if(r>=b)
            return 0;
            s=s+r*c;
            c=c*b;
            n=n/10;
        }
        return s;
    }
    void check()
    {
        int i,j,d,d1,f=0;
        for(i=1;i<=10;i++)
        {
            d = convert(x,i);
            if(d==0)
            continue;
            for(j = 1 ;j <=10; j++)
            {
                d1 = convert(y,j);
                if(d1 == 0)
                continue;
                if(d==d1)
                {
                    System.out.println(x+" in base "+i+"  is equal to "+y+" in base "+j);
                    f=1;
                    break;
                }
            }
            if(f==1)
            break;
            
        }
        if(f!=1)
        System.out.println("No.s are not equal in bases 1 - 10");
        
    }
    public static void main()
    {
        FindBases fb = new FindBases();
        fb.input();
        fb.check();
    }
}


