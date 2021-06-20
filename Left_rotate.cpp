#include <bits/stdc++.h>
using namespace std;
void leftrotate(int arr[],int n,int d);
void reversed(int arr[],int low, int high);
int  main()
{
    int arr[] = { 1, 3, 5, 7, 9 };
    int n = sizeof(arr) / sizeof(arr[0]);
    int d = 2;

    leftrotate(arr,n,d);
    return 0;
}
void leftrotate(int arr[],int n,int d)
{
     reversed(arr,0,d-1);
     reversed(arr,d,n-1);
     reversed(arr,0,n-1);
}
void reversed(int arr[],int low, int high)
{
    while(low<high)
    {
        swap(arr[low],arr[high]);
        low++;
        high--;
    }
}
