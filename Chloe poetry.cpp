#include <bits/stdc++.h>
using namespace std;

long long arr[1000000];

int main()
{
	long long t;
	cin>>t;
	while(t--)
        {
            string s;
            long long ctr=0;
            cin>>s;
            for(int i=1;i<s.length();i++)
                {
                    if((arr[i-1]==0)&&s[i]==s[i-1])
                    {
                        arr[i]=1;
                        ctr++;
                    }
                    else if(i>1&&(arr[i-2]==0)&&s[i]==s[i-2])
                        {
                            arr[i]=1;
                            ctr++;
                        }
                }
		cout<<ctr<<endl;
		for(int i=0;i<s.length();i++)
			arr[i]=0;
	}
}
