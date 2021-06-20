import java.io.*;
public class convertTime
{
    time add(time t1, time t2)
    {
        time t3 = new time();
        t3.hr = t1.hr + t2.hr;
        t3.min = t1.min+t2.min;
        if(t3.min>60)
        {
            t3.hr++;
            t3.min=t3.min-60;
        }
        
        System.out.println(t3);
        return t3;
    }
     static void main()throws IOException
    {
        convertTime ct = new convertTime();
        time obj = new time();
        time obj1 = new time();
        obj.input();
        obj.print();
        obj1.input();
        time obj3 = ct.add(obj,obj1);
        //obj3=obj;
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj3);
        obj.print();
        obj1.print();
        obj3.print();
        
    }
}
