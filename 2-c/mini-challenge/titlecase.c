#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main ()
{ 
 char k[1000];

//Meminta user menginput kalimat. Setiap karakter dari yang user input dibaca dan disimpan dalam variabel k
 printf("Masukkan sebuah string\t: "); scanf("%[^\n]", k);
 printf("Hasil title case\t: ");

//Membaca banyak karakter yang user input menggunakan fungsi strlen
 int l = strlen(k);

//Membaca setiap karakter yang user input
 for (int i=0; i<=l; i++)
 {


//Mengubah semua huruf kapital yang user input menjadi huruf kecil
  if(k[i] >= 'A' && k[i] <= 'Z')
  { k[i] = k[i] + 32; }

//Mengubah huruf pertama yang user input menjadi huruf kapital
  if(k[0] >= 'a' && k[0] <= 'z')
  { k[0] = k[0] - 32; }
 
//Mengubah setiap huruf setelah spasi menjadi huruf kapital
  if(k[i-1] == ' ')
  {
   if(k[i] >= 'a' && k[i] <= 'z')
   {
     k[i] = k[i] - 32;
   }
  }
//Program berakhir membaca ketika bertemu tanda \0 (NULL) pada array bertipe char dalam variabel k yang mengindikasikan bahwa karakter yang user input telah habis
  else if (k[i]=='\0')
  { break; }
  else
  { k[i] = k[i]; }
  
//Mencetak hasil program
  printf("%c", k[i]);

 }

printf("\n");
return 0;
}
