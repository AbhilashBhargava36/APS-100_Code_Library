

public class initials
{
void main(String s)
{
    String st="";
    char ch;
    int i,l,ct=0;
    l=s.length();
    st = st+Character.toUpperCase(s.charAt(0))+".";
    for(i=1;i<l;i++)
    {
            ch=s.charAt(i);
            if(ct<2)
            {
              if(ch==' ')
              { 
                ct++;
                if(ct!=2)
                 st=st+Character.toUpperCase(s.charAt(i+1))+".";
                else
                {
                    i++;
                    st=st+Character.toUpperCase(s.charAt(i));
                }
              }
              else
              {
                continue;
              }
            }
            else
            {
                st= st+ch;
            }
        }
       System.out.println(st);
    }
}
