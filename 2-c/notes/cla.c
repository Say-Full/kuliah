#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[])
{
 if(argc !=3)
 {
  printf("Usage: %s integer1 integer2\n", argv[0]);
  return 1;
 }
 
 printf("%s + %s = %d\n", argv[1],argv[2], atoi(argv[1]) + atoi(argv[2]));
 

return 0;
}
