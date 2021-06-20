#include<bits/stdc++.h>
using namespace std;
int isSubsetSum(int arr[], int n, int sum)
{
    int i,j,ss[n+1][sum+1];
    for(i = 0 ; i <= n ; i++)
        ss[i][0] = 1;
    for(i = 1 ; i <= sum ; i++)
        ss[0][i] = 0 ;
    for(i = 1 ; i <= n ; i++)
        for(j = 1 ; j <= sum ; j++)
            {
                if(ss[i-1][j]==1)
                ss[i][j] = 1;
                else
                {
                    if(arr[i-1]>sum)
                        ss[i][j] = 0 ;
                    else
                        ss[i][j] = ss[i-1][j-arr[i-1]];
                }
            }
       for (int i = 0; i <= n; i++)
     {
       for (int j = 0; j <= sum; j++)
         cout<<ss[i][j]<<" ";
       cout<<endl;
     }
     return ss[n][sum];
}

int main()
{
	int arr[100] ;
	int sum ;
	int n,i,j ;
	cin>>n ;
        cin>>sum;
        int ss[n+1][sum+1];
	for(i = 0 ; i < n ; i++)
        cin>>arr[i];

     if (isSubsetSum(arr, n, sum) == 1)
        cout<<"Found a subset with given sum "<<sum<<endl;
    else
        cout<<"No subset with given sum "<<sum<<endl;
    return 0;
	return 0;
}
