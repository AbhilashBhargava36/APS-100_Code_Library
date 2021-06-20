
import java.util.*;
public class PytahgoreanTriplet
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a,b,c,x,y,z;
        System.out.println("Enter any three numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        x = a*a;
        y = b*b;
        z = c*c;
        if((x == y+z) || (y == x+z) || (z ==x+y))
        System.out.println("The numbers form a Pythagorean triplets");
    }
}
        

