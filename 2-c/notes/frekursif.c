#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int fac(int);

int main ()
{ int n;
//system("clear");
 
 scanf("%d", &n);
 printf("%d\n", fac(n)); 

return 0;
}

 int fac(int n)
{
 if(n==0)
 return 1;
 else return n*fac(n-1);
}
