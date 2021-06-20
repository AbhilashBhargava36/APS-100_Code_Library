
import java.util.*;
public class Roots
{
   void FindRoots()
   {
       Scanner in =  new Scanner(System.in);
       double a,b,c;
       System.out.println("Enter the three coefficients of a Quadratic equation ");
       a = in.nextDouble();
       b = in.nextDouble();
       c = in.nextDouble();
       double d,r1,r2;
       d = b*b - 4*a*c;
       if(d<0)
        System.out.println("The function has imaginary roots");
       if(d==0)
       {
           System.out.println("The roots are real and equal");
           r1 = -b/(2*a);
           System.out.println("The root of the equation is "+r1);
        }
       if(d>0)
       {
           System.out.println("The roots are real and unequal");
           r1 = (-b+Math.sqrt(d))/2*a;
           r2 = (-b-Math.sqrt(d))/2*a;
           System.out.println("The first root is "+r1);
           System.out.println("The second root is "+r2);
        }
    }
}
