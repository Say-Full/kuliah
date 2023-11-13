// Program enkripsi sederhana untuk sebuah string

#include <stdio.h>
#include <string.h>

//Mendeklarasikan fungsi yang akan digunakan
void enkripsi_baru(char *data, char *arah, int pergeseran);

//Mendeklarasikan variabel global
 char data[1000], arah[5];
 int pergeseran;

int main()
{
//Meminta user memasukkan string yang hanya berupa huruf dan spasi
 printf("Masukkan sebuah string\t\t: "); scanf(" %[^\n]", data);
//Meminta user untuk menginput ulang string jika terdapat selain huruf dan spasi
 for(int i=0; data[i] != '\0'; i++)
 {
  if(!((data[i] >= 'A' && data[i] <= 'Z') || (data[i] >= 'a' && data[i] <= 'z') || (data[i] == ' ')))
  {
   printf("Mohon masukkan string yang hanya terdiri dari huruf dan spasi !\n");
   printf("Masukkan sebuah string\t\t: "); scanf(" %[^\n]", data);
   i=0;
  }
 }

//Meminta user memasukkan besarnya pergeseran karakter
 printf("Besar pergeseran karakter\t: "); scanf("%d", &pergeseran);
//Meminta user untuk menginput ulang besar pergeseran jika besarnya pergeseran yang telah diinput kurang dari  atau sama dengan 0
 while(pergeseran <= 0)
 {
  printf("Mohon masukkan bilangan bulat diatas 0 !\n");
  printf("Besar pergeseran karakter\t: "); scanf("%d", &pergeseran);
 }


//Meminta user memasukkan arah pergeseran
 printf("Arah pergeseran\t\t\t: "); scanf("%s", arah);
//Meminta user untuk menginput ulang arah pergeseran jika arah pergeseran yang telah diinput bukan "kiri" atau "kanan"
 while((strcmp(arah,"kiri") && strcmp(arah,"kanan")) != 0)
 {
  printf("Mohon input \"kiri\" atau \"kanan\" !\n");
  printf("Arah pergeseran\t\t\t: "); scanf("%s", arah);
 }


//Memanggil fungsi
 enkripsi_baru(data, arah, pergeseran);

return 0;
}



void enkripsi_baru(char *data, char *arah, int pergeseran)
{

//Membaca setiap karakter yang user input
 for(int i=0; data[i] != '\0'; i++)
 {
//Mengubah semua huruf kapital menjadi huruf kecil
  if(data[i] >= 'A' && data[i] <= 'Z')
  { data[i] += 32; }

  
//Mengoperasikan huruf dengan pergeseran
  if(data[i] >= 'a' && data[i] <= 'z')
  {
   if((strcmp(arah,"kanan")) == 0)
   { data[i] += pergeseran; }
   else if((strcmp(arah,"kiri")) == 0)
   { data[i] -= pergeseran; }

//Jika karakter tersebut diluar rentang nomor ASCII untuk huruf kecil, maka program akan mengembaikan ke dalam siklus abjad huruf kecil
   while(data[i] < 'a' || data[i] > 'z')
   {
    if(data[i] < 'a')
    { data[i] += 26; continue; }
    else if(data[i] > 'z')
    { data[i] -= 26; continue; }
   }
  }
//Jika program membaca spasi, maka karakter spasi tidak diubah (diabaikan)
  else if(data[i] == ' ')
  { data[i] = ' '; }
 }

//Mencetak hasil program
 printf("Hasil enkripsi\t\t\t: %s\n", data);

}
