import java.util.*;
public class alphabetsentencer
{
    String str;
        void main()
    {
        alphabetsentencer ob = new alphabetsentencer();
        ob.accept();
        ob.doit();
    }
    void accept()
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter a string in upper case");
        str = in.nextLine();
    }
    void doit()
    {
        String s , s1 = "" ;char ch1=' ';String word1="";char chaa=' ';String word2="";
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens())
        {
            s = st.nextToken();
            s1 = s;
        ch1 = s1.charAt(0);
        word1 = word1 + ch1 ;
        word1 = word1.toUpperCase();
        }
    System.out.println("word before arrangement are-");
    System.out.println(word1);
    int length=word1.length();
    System.out.println("word after arrangement are-");
    for(char x = 'A' ; x <= 'Z' ; x++)
    {
        for(int y = 0 ; y < length ; y++)
        {
            if( x == word1.charAt(y))
            {
                System.out.print(word1.charAt(y));
            }
        }
    }
    }
    }
   

