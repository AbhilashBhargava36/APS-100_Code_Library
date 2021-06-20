
import java.util.*;
public class PostToIn
{
    String s;
    char a[],b[];
    int l,m;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Postfix expression ");
        s = in.nextLine();
        l = s.length();
        int i,j;
        a = new char[l];
        b = new char[l];
        a = s.toCharArray();
        for(i = 0,j=0;i<l;i++)
        {
            char ch = a[i];
            switch(a[i])
            {
                case '+':
                case '-':
                case '*':
                case '/':b[j]=a[i];
                         j++;
                         break;
            }
        }
        m=j;
        System.out.println("Character array ");
        for(i=0;i<l;i++)
        System.out.print(a[i]);
        System.out.println("\nOperators ");
        for(i=0;i<j;i++)
        System.out.println(b[i]);
    }
    void convert()
    {
        int x=0,y=0,i,j;
        for(i=0;i<m;i++)
        {
            for(j=l-1;j>=x;j--)
            {
                if(a[j]==b[i])
                 y=j;
            }
            for(j=y;j>x;j--)
            {
                if(Character.isLetter(a[j])&&Character.isLetter(a[j+1]))
                {
                    break;
                }
            }
            x=j;
            for(j=y;j>x;j--)
            a[j]=a[j-1];
            a[j]=b[i];
            for(j=0;j<m-1;j++)
            b[j]=b[j+1];
            m=j;
        }
    }
        void display()
        {
            System.out.println("Displaying the Infix form ");
             for(int i=0;i<l;i++)
                System.out.print(a[i]);
        }
}
