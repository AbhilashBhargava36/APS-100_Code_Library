import java.util.*;
public class encrypt
{
public static void main()
{
String b="";
Scanner in=new Scanner(System.in);
System.out.println("Enter");
String s=in.nextLine();
System.out.println("Enter Shift");
int s1=in.nextInt();
if(s1>=1 && s1<=26)
{
for(int i=0 ; i<s.length() ; i++)
{
char ch=s.charAt(i);
int d=(int)ch;
d=d+s1-1;
if(d>90)
{
d=d-26;
}
char e=(char)d;
if(ch!=' ')
{
b=b+e;
}
}
System.out.println(b);
b=b.replace("QQ"," ");
System.out.println(b);
}
}
}
