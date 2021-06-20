
import java.util.*;
//import java.lang.*;

public class sortSentence
{
    String vow[]=new String[100];
    int c;
   void sort(String arr[])
   {
       int i,j,l;
       l=arr.length;
       for(i=0;i<l;i++)
       {
           for(j=0;j<l-1;j++)
           {
               if(arr[j].compareTo(arr[j+1])>0)
               {
                   String t =arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=t;
                }
            }
        }
        
    }
    String separate(String s)
    {
        String ns="";
        char ch;
        //System.out.println(s);
        StringTokenizer st = new StringTokenizer(s);
        int l = st.countTokens(),j;
        String a[] = new String[l];
        for(j = 0;j<l;j++)
        {
            a[j] = st.nextToken();
            ch=a[j].charAt(0);
            if(ch=='A' || ch=='E' || ch== 'I' || ch=='O'||ch=='U')
            {
                vow[c]=a[j];
                c++;
            }
            //System.out.println(a[j]);
        }
        sort(a);
        for(j=0;j<l-1;j++)
        {
             ns=ns+a[j]+" ";
        }
        ns=ns+a[l-1];
        //System.out.println(ns);
       return ns;
    }
    void main(String str)
    {
        
        String s="",ns="";
        c=0;
        str=str.toUpperCase();
        int len = str.length(),i,j;
        for(i = 0;i<len;i++)
        {
            char ch = str.charAt(i);
            if(ch!='!' && ch!='?' && ch != '.' && ch != ',')
            { 
                s=s+ch;
            }
            else
            {
                
                ns = ns+separate(s)+ch+" ";
                s="";
            }
        }
        System.out.println(ns);
        System.out.println("Vowel words ");
        for(i=0;i<c;i++)
            System.out.println(vow[i]);
    }
    
}
