#include <stdio.h>
#include <stdlib.h>

int main()
{
 char fi[20], fo[20], d, c;
 FILE *r;
 FILE *w;
 
 printf("File yang diproses\t: "); scanf(" %[^\n]", fi);
 r = fopen(fi, "r");
 if(r == NULL)
 {
  printf("Kesalahan saat membaca file...\n");
  return 1;
 }
 
 printf("File hasil\t\t: "); scanf(" %[^\n]", fo);
 w = fopen(fo, "w");
 
 printf("Karakter yang dihapus\t: "); scanf("%c", &d);
 
 printf("\nPenghapusan Karakter Berhasil!");
 
 
 
 
 while((c = fgetc(r)) != EOF)
 {
  if(c == d)
  {
   continue;
  }
  else
  {
   fprintf(w, "%c", c);
  }
 }
	

 fclose(r);
 fclose(w);
return 0;
}
