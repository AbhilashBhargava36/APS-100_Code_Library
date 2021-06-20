import java.util.*;
public class valid_shuffle
{
    String str1 ;
    String str2 ;
    String str3 ; 
    void main()
    {
        valid_shuffle ob = new valid_shuffle();
        ob.accept();

        ob.checkvalidshuffle2();
    }
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first string  ");
        str1 = in.nextLine();
        System.out.println("enter the second string  ");
        str2 = in.nextLine();
        System.out.println("enter the third string  ");
        str3 = in.nextLine();
    }
    void checkvalidshuffle2()
    {
        int j=0;int c=0 ;
        for(int i = 0 ; i <str1.length(); i++)
        {
            if(str3.charAt(j) != str1.charAt(i) || str3.charAt(j+1) != str2.charAt(i))
            {
                c=c+1;
            }
      
            j=j+2;
        }if(c==0)System.out.println("valid shuffle ");
        else System.out.println("invalid shuffle ");
    }
}
    
            
