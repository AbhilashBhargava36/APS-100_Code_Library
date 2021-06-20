#include <bits/stdc++.h>
using namespace std;
void reverseStr(string& str)
{
	int n = str.length();
	for (int i = 0; i < n / 2; i++)
		swap(str[i], str[n - i - 1]);
}
int main()
{
    string str1;
      getline(cin,str1);
      int m = str1.size();
	reverseStr(str1);
	cout << str1;
	return 0;
}
