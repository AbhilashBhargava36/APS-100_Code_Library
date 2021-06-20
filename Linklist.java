
import java.util.*;
public class Link
{
   int lnk[] = new int[50];
   int begin, end, max;
   Link(int mm)
   {
       max=mm;
       begin = 0;
       end = 0;
    }
    void addLink(int v)
    {
        end++;
        if(end==max)
        {
            System.out.println("OUT OF SIZE ");
            
        }
        else
        {
         lnk[end]=v;
        }
    }
    int delLink()
    {
        if(begin>end)
        {
            System.out.println("EMPTY ");
            begin = 0;end = 0;
            return -99;
        }
        else
        {
            begin++;
            return lnk[begin-1];
        }
    }
    void display()
    {
        int i;
        for(i=begin+1;i<end;i++)
        {
            System.out.println(lnk[i]);
        }
    }
    static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored ");
        int mm = in.nextInt();
        Link lk = new Link(mm);
        for(int i = 0 ;i<mm;i++)
        {
            lk.addLink(i+1);
        }
        lk.display();
        System.out.println("Element removed "+lk.delLink());
    }
}
        
        
