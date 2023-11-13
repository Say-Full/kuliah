#include<stdio.h>
#include<conio.h>


int main()
{
 char pwd[9];
 int i;
 
 for(i=0; i<8; i++)
 {
  pwd[i] = getch();
  printf("*");
 }
 pwd[i] = '\0';
 
 printf("\nEntered pass : ");
 for(i=0; pwd[i] != '\0'; i++)
 {
 	printf("%c", pwd[i]);
 }
 
 getch();


return 0;	
}










































/*
Peny. mslh:
(^) input program = nama file teks yg user input
(^) buka file trsbt, baca per baris, hilangkan tanda baca, kecilkan semua huruf
(^) ambil kata dl setiap baris dgn strtok
() skoring. Jika ada kata yg duplikat, tulis frekuensi muncul
() pkk array + struct untuk menghimpun skor, frekuensi, pnjng kata, kata
() sorting dr skor trbsr ke trkcl + urutkan kata trpnjng ke trpendek dr himpunan kata yg memiliki skor yg sama
() simpan hasil dlm file binari, nama file binari ditulis manual
() baca kembali file binari trsbt + buat menu di monitor
() 1. simpan, 2. simpan + tampilkan n data, 3. selesai, program menu terus berulang hingga user pilih 3
*/




/*
Bg Z = s:
 count = i
 i = j
*/

/*"masing-masing" mw buat jd 1 paket atw jadiin 2 kata yg berbeda ? kita buat digabung*/
