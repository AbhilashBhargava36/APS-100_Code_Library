#include<bits/stdc++.h>
using namespace std;
void print(std::vector <int> const &a) {
   std::cout << "The vector elements are : ";

   for(int i=0; i < a.size(); i++)
   std::cout << a.at(i) << ' ';
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
    arr.push_back(45);
    arr.push_back(69);
    arr.push_back(73);
    arr.push_back(10);
    arr.push_back(20);
    cout<<solve(arr,arr.size());
    return 0;
}

