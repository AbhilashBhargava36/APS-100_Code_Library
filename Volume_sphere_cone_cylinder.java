import java.io.*;
public class Cone
{
   void main()throws IOException
    {
        int h,r,pi,vc,vco,vs,ch;
        pi=22/7;
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
      
        System.out.println("choose one of these");
        System.out.println("1.to calculate the volume of a cylinder");
        System.out.println("2.to calculate the volume of a sphere");
        System.out.println("3.to calculate the volume of a cone");
        ch=Integer.parseInt(br.readLine());
      
        switch(ch)
        {
            case 1:
            System.out.println("enter the radius");
              r=Integer.parseInt(br.readLine());
            System.out.println("enter the height");
              h=Integer.parseInt(br.readLine());
              vc=pi*r*r*h;
            System.out.println("the volume is"+vc);
            break;
            case 2:
            System.out.println("enter the radius");
              r=Integer.parseInt(br.readLine());
            System.out.println("enter the height");
              h=Integer.parseInt(br.readLine());
              vs=pi*r*r*r;
            System.out.println("the volume is"+vs);
            
            break;
            case 3:
            System.out.println("enter the radius");
              r=Integer.parseInt(br.readLine());
            System.out.println("enter the height");
              h=Integer.parseInt(br.readLine());
              vco=(1/3)*pi*r*r*h;
            System.out.println("the volume is"+vco);
            break;
            default:System.out.println("wrong choice");
    }
}
}
