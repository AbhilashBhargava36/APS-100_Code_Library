import java.util.*;
public class Stack1
{
    int stk[]=new int[50];
    int top;
    int size;
    int val;
    Stack1()
    {
        top=-1;
        val = 0;
    }
    void push()
    {
        top++;
        if(top==size)
        System.out.println("Stack overflow");
        else
         stk[top]=val;
   }
   int pop()
   {
       if(top==-1)
       {
           System.out.println("Stack underflow");
           return -9999;
        }
        else
        {
            val=stk[top];
            top--;
            return val;
        }
    }
    void disp()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("Displaying the elements");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stk[i]);
            }
        }
    }
    void main()
    {
        Scanner in = new Scanner(System.in);
        int ch= 0;
        System.out.println("Enter the size");
        size = in.nextInt();
        while(ch!=4)
        {
            System.out.println("1. Push ");
            System.out.println("2. Pop ");
            System.out.println("3. Display ");
            System.out.println("4. Exit ");
            System.out.println("Enter ur choice 1/2/3/4 ");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter a value ");
                       val= in.nextInt();
                       push();
                       break;
                case 2 : val = pop();
                         System.out.println("Value is " + val);
                         break;
                case 3 : disp();
                          break;
                case 4 :           
            }
         }
        }
    }
              
