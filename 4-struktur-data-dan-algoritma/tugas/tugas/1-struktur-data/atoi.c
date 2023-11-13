#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
   char a[10] = "9", b[10] = "1";
   strcat(a,b);
   int hasil = atoi(a) + 2;
   

   printf("%d", hasil);

   return 0;
}