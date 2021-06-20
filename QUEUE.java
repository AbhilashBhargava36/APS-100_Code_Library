
import java.util.*;
public class DeQueue
{
  int dque[]= new int[200];
  int capacity;
  int F,R;
  DeQueue()
  {
      int i;
      for(i=0;i<200;i++)
      {
          dque[i]=0;
        }
    }
    DeQueue(int nx, int nf, int nr)
    {
        capacity = nx;
        F = nf;
        R = nr;
    }
    void pushAtRear(int num)
    {
        R++;
        if(R==capacity)
        {
            System.out.println("DeQueue overflow");
            
        }
        else
        {
            dque[R]=num;
            DisplayDque();
        }
        
    }
    void pushAtFront(int num)
    {
        
        if(F<0)
        {
            System.out.println("DeQueue overflow");
            F=-1;
        }
        else
        {
            dque[F]=num;
            F--;
            DisplayDque();
        }
        
    }
    int RemoveRear()
    {
        if(R==F)
        {
            F=-1;R=-1;
            System.out.println("Dequeue is empty");
            return -999;
        }
        else
        {
            R--;
            return dque[R+1];
        }
    }
    int RemoveFront()
    {
        if(F==R)
        {
            F=-1;R=-1;
            System.out.println("Dequeue is empty");
            return -999;
        }
        else
        {
            F++;
            return dque[F];
        }
    }
    void DisplayDque()
    {
        int i;
        System.out.println("Displaying the elemnts of Dequeue ");
        if(R==capacity)
         R--;
        for(i=F+1;i<=R;i++)
        {
            System.out.println(dque[i]);
        }
    }
    void main()
    {
        Scanner in = new Scanner(System.in);
        int ch,ch1,n,s;
        System.out.println("Enter the capacity of Dequeue ");
        s = in.nextInt();
        DeQueue dq = new DeQueue(s,-1,-1);
        do
        {
        System.out.println("1. Add ");
        System.out.println("2. Remove ");
        System.out.println("3. Display ");
        System.out.println("4. Exit ");
        System.out.println("Enter your choice ");
        ch = in.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter 1 to add from rear and 2 to add from Front ");
            ch1=in.nextInt();        
            System.out.println("Enter the number to be added");
            n = in.nextInt();
            if(ch1 == 1)
            {
                dq.pushAtRear(n);
            }
            else
                dq.pushAtFront(n);
            break;
            case 2:System.out.println("Enter 1 to remove from rear and 2 to remove from Front ");
            ch1=in.nextInt();
            if(ch1==1)
             {
                 n=dq.RemoveRear();
                 System.out.println("Element removed is "+n);
                }
                else
                {
                    n= dq.RemoveFront();
                    System.out.println("Element removed is "+n);
                }
                break;
                case 3: dq.DisplayDque();
                break;
                case 4: System.out.println("Exit the program ");
                break;
                default : System.out.println("Wrong choice entered ");
            }
        }while(ch!=4);
    }
        
}
