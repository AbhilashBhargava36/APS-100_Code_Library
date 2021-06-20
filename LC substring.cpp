#include <bits/stdc++.h>
using namespace std;

void printLCSubStr(string X, string Y, int m, int n)
{
	int LCSuff[m + 1][n + 1];
	int len = 0;
	int row, col;
	for (int i = 0; i <= m; i++)
  {
		for (int j = 0; j <= n; j++)
    {
			if (i == 0 || j == 0)
				LCSuff[i][j] = 0;
			else if (X[i - 1] == Y[j - 1])
      {
				LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
				if (len < LCSuff[i][j])
        {
					len = LCSuff[i][j];
					row = i;
					col = j;
				}
			}
			else
				LCSuff[i][j] = 0;
		}
	}
	if (len == 0)
  {
		cout << "No Common Substring";
		return;
	}
	char* resultStr = (char*)malloc((len + 1) * sizeof(char));
	while (LCSuff[row][col] != 0) {
		resultStr[--len] = X[row - 1];
		row--;
		col--;
	}
	cout<<"The common substring is\n"<<resultStr<<endl;
  int lent = strlen(resultStr);
  cout<<"Length is "<<lent<<endl;
}
int main()
{
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  int m = str1.size();
  int n = str2.size();
  printLCSubStr(str1, str2, m, n);
	return 0;
}
