#include<bits/stdc++.h>
using namespace std;
void lcs(string str1, string str2, int m, int n )
{
   int L[m+1][n+1];
   for (int i=0; i<=m; i++)
   {
     for (int j=0; j<=n; j++)
     {
       if (i == 0 || j == 0)
         L[i][j] = 0;
       else if (str1[i-1] == str2[j-1])
         L[i][j] = L[i-1][j-1] + 1;
       else
         L[i][j] = max(L[i-1][j], L[i][j-1]);
     }
   }
   int dp = L[m][n];
   char lcs[dp+1];
   lcs[dp] = '\0';
   int i = m, j = n;
   while (i > 0 && j > 0)
   {
      if (str1[i-1] == str2[j-1])
      {
          lcs[dp-1] = str1[i-1];
          i--; j--; dp--;
      }
      else if (L[i-1][j] > L[i][j-1])
         i--;
      else
         j--;
   }
   cout << "LCS of " << str1 << " and " << str2 << " is " << lcs<<endl;
   cout<<"Length is "<<strlen(lcs)<<endl;
}
int main()
{
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  int m = str1.size();
  int n = str2.size();
  lcs(str1, str2, m, n);
  return 0;
}
