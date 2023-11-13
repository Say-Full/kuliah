#include <stdio.h>

int main()
{
 int i, n, flag, a, k;
 
 printf("Enter a positive number : "); scanf("%d", &a);
 
 for(k=2; k <= a; k++)
 {
  flag = 0;
  for(i=2; i <= k/2; i++)
  {
   if(k%i == 0)
   {
   	flag=1;
    break;
   }
  }
  
  if(flag==0)
  {
  	printf("%d ", k);
  }
 }


return 0;
}
