class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack <Character> st1 = new Stack<Character>();
        Stack <Character> st2 = new Stack<Character>();
        
        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[t.length()];
        
        for(int i=0; i<s.length(); i++)
        {
            arr1[i] = s.charAt(i);
        }
        for(int j=0; j<t.length(); j++)
        {
            arr2[j] = t.charAt(j);
        }
        
        for(int k=0; k< arr1.length; k++)
        {
            if(arr1[k] == '#' && st1.empty() == false)
            {
                st1.pop();
            }
            
            if(arr1[k] != '#')
            {
                st1.push(arr1[k]);
            }
        }
        
        for(int p=0; p< arr2.length; p++)
        {
            if(arr2[p] == '#' && st2.empty() == false)
            {
                st2.pop();
            }
            
            if(arr2[p] != '#')
            {
                st2.push(arr2[p]);
            }
        }
        
        boolean flag = true;
        
        if( st1.size() != st2.size())
        {
            flag = false;
            return flag;
        }
        
        while (st1.empty() == false)
        {
            
        if (st1.peek() == st2.peek())
        {
            st1.pop();
            st2.pop();
        }
        else
        {
            flag = false;
            break;
        }
        }
        
        return flag;
    }
}
