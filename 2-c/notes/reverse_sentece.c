#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main ()
{ 
 char k[150];

//Meminta user meginput kalimat, tapi yang dibaca hanya 150 karakter saja
 printf("Masukkan kata-kata\t: "); scanf("%[^\n]", k);
 printf("Hasil balik\t\t: ");

//Membaca banyak karakter yang user input menggunakan fungsi strlen
 int l = strlen(k);

//Membaca setiap karakter yang user input
 for (int i=0; i<l; i++)
 {


//Mengubah semua huruf kapital yang user input menjadi huruf kecil
  if(k[i] >= 'A' && k[i] <= 'Z')
  { k[i] = k[i] + 32; }
 }

//Memutar-balikkan semua karakter yang user input dari ujung hingga awal
  for (int j=l; j>=0; j--)
 { 

//Mencetak hasil program  
  printf("%c", k[j]);

 }

printf("\n");
return 0;
}
