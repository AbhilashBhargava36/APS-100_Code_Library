#include<bits/stdc++.h>
using namespace std;
int main()
{
	int i, j;
	cout<<"Enter array"<<endl;
	int arr[100] ;
	int n,t ;
	cin>>n;
	for(int i = 0 ; i < n ; i++ )
    cin>>arr[i];
	for (i = 0; i < n-1; i++)
	for (j = 0; j < n-i-1; j++)
		if (arr[j] > arr[j+1])
			{
			    t = arr[j];
			    arr[j]=arr[j+1];
			    arr[j+1]=t;
			}
			cout<<"Sorted array: \n";
			for(int i = 0 ; i < n ; i++ )
                cout<<arr[i];
    return 0;
}
