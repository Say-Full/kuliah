#include<stdio.h>
#include<string.h>
#include<stdlib.h>


int main ()
{
//system("clear");
// buat array dan pointer nya
 int strcmp(char *s1, char *s2){
     
 while (*s1 != '\0' || *s2 != '\0'){
       if(*s1 == *s2){
          s1++; s2++;
       } else if(*s1 > *s2){
                 return 1;
         } else { return -1;}
       }
 } return 0;
}
