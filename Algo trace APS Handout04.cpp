include<bits/stdc++.h>
using namespace std;
int main()
{
    char a[] = {'a','b','c'};
    int N = 3 ;
    for(int i = 0 ; i<(1<<N);i++)
    {
        for(int j = 0 ; j < N ; j++)
            if(i&(1<<j))
            cout<<a[j]<<" ";
        cout<<endl;
    }
    return 0 ;
}
