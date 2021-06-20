import java.util.*;
public class trans_array
{
    int arr[][]=new int[20][20]; int n ; int  m ;int arr1[][]=new int[20][20];
    trans_array(int mm , int nn) 
    {
        m = mm ;
        n = nn ;
    }
    void fill_array()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
    }
    void transpose(trans_array A)
    {
        for(int i = 0 ; i < A.m ; i++)
        {
            for(int j = 0 ; j < A.n ; j++)
            {
                arr[i][j] = arr[j][i];
            }
        }
    }
    void display()
    {
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int r = in.nextInt();
        System.out.println("enter the no. of columns");
        int c = in.nextInt();
        trans_array A = new trans_array(r,c);
        A.fill_array();
        System.out.println("the initial array is :  ");
        A.display();
        trans_array B = new trans_array(c,r);
        System.out.println("the transpose array is ");
        B.transpose(A);
        B.display();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
