#include <stdio.h>
#include <string.h>

int main()
{
 char str[400], s;
 int i;
 
 printf("Masukkan sebuah string : "); scanf(" %[^\n]", str);
 
 for(i=strlen(str)-1; i >= 0; i--)
 {
  printf("%c", str[i]);
 }


return 0;
}
