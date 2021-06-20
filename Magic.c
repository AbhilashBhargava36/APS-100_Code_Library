#include<bits/stdc++.h>
using namespace std;
int solve(int *l,int j,int n);
int main()
{
    int a[20];
    int n ;
    cin>>n;
    cout<<solve(a,0,10)+1;
}

int solve(int *l,int j,int n)
{
  {
  int l[n];
  for(int i=0;i<n;i++)
  {
  cin>>l[n];
  }

if(j==n)
{
int sum=0;
int k=0;
while(k<n/2)
{
sum=sum+abs(l[k]-l[n-1-k]);
k++;
}
return sum;
}

int t1=solve(l,j+1,n);
int t=0;
if(j>0 && j+1<n &&(l[j-1]%2==0&& l[j+1]%2==0))
{
    l[j]=(l[j+1]+l[j-1])/2;
    int t=solve(l,j+1,n);
}
int b=max(t,t1);
return b;
}
