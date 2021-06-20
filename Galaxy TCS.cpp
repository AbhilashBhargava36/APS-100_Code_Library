#include <iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  	int n,cur_x;
  	cin>>n;
  	if(n<3 || n>100000)
        exit(0);
    else
    {
  	char arr[3][n];
  	for(int i=0;i<3;i++)
	{
  	  	for(int j=0;j<n;j++)
		{
  	    	cin>>arr[i][j];
    	}
  	}
  	for(int i=0;i<n;i++)
  	{
    	if(arr[0][i]=='#' && arr[1][i]=='#' && arr[2][i]=='#')
		{
      		cout<<'#';
    	}
		else
		{
      		char a,b,c,a1,b1,c1,a2,b2,c2;
      		cur_x = i;
      		a = arr[0][cur_x];      		    b = arr[0][cur_x+1];         		c = arr[0][cur_x+2];
      		a1 = arr[1][cur_x];      		b1 = arr[1][cur_x+1];      		c1 = arr[1][cur_x+2];
      		a2 = arr[2][cur_x];      		b2 = arr[2][cur_x+1];      		c2 = arr[2][cur_x+2];
      		if(a=='.' && b=='*' && c=='.' && a1=='*' && b1=='*' && c1=='*' && a2=='*' && b2=='.' && c2=='*')
	  		{
      			cout<<"A";
      		  	i+=2 ;
      		}
      		if(a=='*' && b=='*' && c=='*' && a1=='*' && b1=='*' && c1=='*' && a2=='*' && b2=='*' && c2=='*')
	  		{
      		  	cout<<"E";
      		  	i+=2 ;
      		}
      		if(a=='*' && b=='*' && c=='*' && a1=='.' && b1=='*' && c1=='.' && a2=='*' && b2=='*' && c2=='*')
	  		{
      		  	cout<<"I";
      		  	i+=2 ;
      		}
      		if(a=='*' && b=='*' && c=='*' && a1=='*' && b1=='.' && c1=='*' && a2=='*' && b2=='*' && c2=='*')
	  		{
      		  	cout<<"O";
      		  	i+=2 ;
      		}
      		if(a=='*' && b=='.' && c=='*' && a1=='*' && b1=='.' && c1=='*' && a2=='*' && b2=='*' && c2=='*')
	  		{
      		  	cout<<"U";
      		  	i+=2;
      		}
    	}
  	}
}
}
