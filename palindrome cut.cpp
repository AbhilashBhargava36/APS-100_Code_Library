#include <iostream>
using namespace std;
int isPalindrome(string STR, int i, int j)
{
	while (i <= j)
	{
		if (STR[i++] != STR[j--])
			return 0;
	}
	return 1;
}

int cuts(string STR, int i, int j)
{
    int k = isPalindrome(STR, i, j);
    if (i == j || k == 1 )
        return 0;
    int min=9999 ;

    for (int k = i; k < j ; k++)
    {
        int count = 1 + cuts(STR, i, k) +cuts(STR, k + 1, j);

        if (count < min)
            min = count;
    }
    return min;
}
int main()
{
	string STR;
	cin>>STR;
	int n = STR.length();
	cout << "min cuts  "<< cuts(STR, 0, n - 1);
	return 0;
}
