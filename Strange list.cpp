#include<iostream>
using namespace std;
void solve(long long arr[],int x,int n);
int main()
{
    int i,n,x,t;
    long long arr[100000];
    cin>>t;
    while(t--)
    {
    cin>>n>>x;
    for(i=0;i<n;i++)
        cin>>arr[i];
    solve(arr,x,n);
    }
}
void solve(long long arr[],int x,int n)
{
    long long b[100000];
    int i=0,j=0,k=0,temp,ct=-1;
    long long sum = 0 ;
    long long m=1000000000;
    for(i=0;i<n;i++)
    {
        temp=arr[i];
        b[i]=0;
    while(temp%x==0)
    {
        temp=temp/x;
        b[i]++;
    }
    if(b[i]<m)
    {
        m=b[i];
        ct=i;
    }
    }
    for(int i=0;i<n;i++)
        {
             sum=sum+(m+1ll)*arr[i];
        }
   for(int i=0;i<ct;i++)
    {
             sum=sum+arr[i];
    }
    cout<<sum<<"\n";
}
