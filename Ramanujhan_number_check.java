
import java.util.*;
public class RamanujanNumber
{
   
   public static void main() 
   { 
       Scanner in = new Scanner(System.in);
      // read in one command-line argument
      int N,f=0;
      for(N = 1729;N<=9999;N++)
      {
          f=0;
      // for each a, b, c, d, check whether a^3 + b^3 = c^3 + d^3
      for (int a = 1; a <= N; a++) 
      {
         int a3 = a*a*a;
         if (a3 > N)
         break;

         // start at a to avoid print out duplicate
         for (int b = a; b <= N; b++) 
         {
            int b3 = b*b*b;
            if ((a3 + b3) > N) 
            break;

            // start at a + 1 to avoid printing out duplicates
            for (int c = a + 1; c <= N; c++) 
            {
               int c3 = c*c*c;
               if (c3 > (a3 + b3))
               {
                   break;
                }

               // start at c to avoid printing out duplicates
               for (int d = c; d <= N; d++) 
               {
                  int d3 = d*d*d;
                  if (c3 + d3 > a3 + b3) 
                  {
                     break;
                  }

                  if (c3 + d3 == a3 + b3)
                  {
                     System.out.print((a3+b3) + " = ");
                     System.out.print(a + "^3 + " + b + "^3 = "); 
                     System.out.print(c + "^3 + " + d + "^3"); 
                     System.out.println();
                     f=1;
                     break;
                  }
               }
               
               
            }
            
         }
         
      }
      
   }
}
}
