

public class VampireNumbers
{  int n,c,l;
   public void anagrm(String s1, String s2)
   {
       
    if(s1.length() == 0) 
    {
       int p1,p2;
       int j = Integer.parseInt(s2);
       p1 = j/(int)Math.pow(10,l);
       p2 = j%(int)Math.pow(10,l);
       if((p1*p2==n))
       { 
           if((p1%10!=0)||(p2%10!=0))
           {  c++;
               if(c<2)
               System.out.println(n);
               else
               return;
            }
        }
     }
    for(int i = 0; i < s1.length(); i++) 
    {
         anagrm(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
    }
}
void main()
{
       int i;String anag;
       System.out.println("Displaying all 4 digit vampire numbers ");
       for(i=1000;i<=9999;i++)
       {
           anag=Integer.toString(i);
           if(anag.length()%2!=0)
            continue;
           n = i;c=0;l=anag.length()/2;
           anagrm(anag,"");
       }
}
}


