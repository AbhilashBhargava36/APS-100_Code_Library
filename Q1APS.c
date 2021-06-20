#include <stdio.h>
#include <limits.h>
#include <stdlib.h>
typedef long double ll;
int main() {
    ll i,n;
    scanf("%Lf",&n);
    ll x=n;
    int count = 0 ;
   do
    {
    ++count;
    x*=10;
   }
   while((int)(x)%10!=0);
   printf("\n%d",--count);
    return 0 ;
}
