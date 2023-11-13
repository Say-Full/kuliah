// Program menimpa (replace) karakter tertentu dari sebuah string


#include <stdio.h>

//Mendeklarasikan fungsi yang akan dipakai
char *ganti_karakter(char *data, char find, char replace);

//Mendeklarasikan variabel global
 char data[1000], find, replace;


int main()
{
 int u;
//Mendeklarasikan pointer yang digunakan untuk memodifikasi array
 char *f = &data[0];

//Meminta user menginput string
 printf("Masukkan sebuah string\t: "); scanf(" %[^\n]", data);


//Melakukan pengulangan jika user ingin mengganti lagi karakter dalam string
do
{
//Meminta user menginput karakter yang dicari
 printf("Karakter yang dicari\t: "); scanf("%s", &find);
//Meminta user menginput karakter pengganti
 printf("karakter pengganti\t: "); scanf("%s", &replace);

//Memanggil fungsi
 f = ganti_karakter(data, find, replace);

//Menampilkan hasil substitusi
 printf("String hasil substitusi\t: %s\n", f);
//Menanyakan user ingin mengganti lagi atau tidak
 printf("Ganti lagi ? (1/0)\t: "); scanf("%d", &u);
}
while(u != 0);

return 0;
}



char *ganti_karakter(char *data, char find, char replace)
{

//Membaca semua karakter dalam array
 for(int i=0; data[i] != '\0'; i++)
 {
//Jika karakter yang dicari ditemukan maka diganti dengan karakter pengganti
  if(data[i] == find)
  { data[i] = replace; }
 }

return data;
}
