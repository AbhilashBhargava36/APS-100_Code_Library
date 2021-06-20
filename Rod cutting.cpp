#include<bits/stdc++.h>
using namespace std;
int maxo(int a,int b,int c)
{
    if(a>=b && a>=c)
        return a;
    else if(b>=a && b>=c)
        return b;
    else
        return c;
}
int main()
{
	int arr[100];
	int n,len,i,j ;
	cin>>len;
	for(i = 0 ; i <= n ; i++)
        arr[i] = 0 ;
    for(i = 2 ; i <= len ; i++ )
        for(j = 1 ; j <= i/2 ; j++)
    arr[i] = maxo(arr[i] ,j*(i-j) ,j*arr[i-j]);
    for(i = 0 ; i <= len ; i++)
        cout<<arr[i]<<" ";
	return 0;
}
