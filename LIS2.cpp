#include<bits/stdc++.h>
using namespace std;
void print(std::vector <int> const &a)
{
   cout << "The vector elements are : ";
   for(int i=0; i < a.size(); i++)
   cout << a.at(i) << ' ';
   cout<<endl;
}
int solve(vector<int> arr,int n)
{
    vector<int> lis;
    for(auto i = 0;i<n;i++)
    {
        auto it = lower_bound(lis.begin(),lis.end(),arr[i]);
        if(it==lis.end())
            lis.push_back(arr[i]);
        else
            *it = arr[i];
    }
    return lis.size();
}
int main()
{
    vector<int> arr;
    arr.push_back(50);
    arr.push_back(3);
    arr.push_back(10);
    arr.push_back(7);
    arr.push_back(40);
    arr.push_back(80);
    print(arr);
    cout<<solve(arr,arr.size())<<endl;
    return 0;
}
