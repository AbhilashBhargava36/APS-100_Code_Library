import java.util.*;
class commondate
{
public static void main()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Friends");
int n=in.nextInt();
int a[][]=new int[n][31];
for(int i=0 ; i<n ; i++)
{
System.out.println("Enter");
for(int j=0 ; j<31 ; j++)
{
a[i][j]=in.nextInt();
if(a[i][j]==0 || a[i][j]>31)
{
break;
}
}
}
int c=0;
for(int k=0 ; k<31 ; k++)
{
int b=a[0][k];
for(int i=0 ; i<n ; i++)
{
for(int j=0 ; j<31 ; j++)
{
if(a[i][j]==b)
{
c++;
}
}
}
if(c==n)
{
System.out.println(b);
}
c=0;
}
}
}
