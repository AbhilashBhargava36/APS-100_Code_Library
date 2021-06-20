
import java.io.*;
public class Abhilash
{
void main()throws IOException
{
   int d,m,y;
   BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
   System.out.println("enter the date");
   d=Integer.parseInt(br.readLine());
   System.out.println("enter the month");
   m=Integer.parseInt(br.readLine());
    System.out.println("enter the year");
   y=Integer.parseInt(br.readLine());
   if(d<=31&&d>=1&&m==1&&m==3&&m==5&&m==7&&m==8&&m==10&&m==12&& d !=29&&d!=28)
   {
   System.out.println("valid date");
    }
    else if(d<=30&&d>=1&&m==4&&m==6&&m==9&&m==11&& d !=29&d!=28)
    {
    System.out.println("valid date");
}
    else if (y%4!=0 && d>=1&&d<=28 && m==2)  
    {
           System.out.println("valid date");
}
else if(y%4 ==0 && m ==2 && d== 29)
{
System.out.println("it is a valid date");
}
    else
    {
    System.out.println("invalid date");
}
}
}
