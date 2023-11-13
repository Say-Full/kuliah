#include <stdio.h>
#include <string.h>


int main()
{
/*
 typedef int Time;
 Time hours, minutes, second;
*/



/*
 typedef char *String;
 String namaMhs, alamatMhs;
*/



/*
 typedef char Kata[100];
 Kata sapa, kalimat;
*/



/*
 struct tgl { int hari, bulan, tahun; };
 typedef struct tgl Tanggal;
 Tanggal date;
*/



/*
 typedef struct tgl { int hari, bulan, tahun; } Tanggal;
 Tanggal date;

 date.hari = 2;
 date.tahun = 2001;



 Tanggal *pdate = &date;

 pdate -> hari = 2;
 pdate -> bulan = 11;
 pdate -> tahun = 2001;
*/



/*
 typedef struct dateofbirth { char nama[30], tempat[33]; Tanggal waktu; } DOB;
 DOB TTL;


 TTL.nama = "Saiful";
 TTL.tempat = "Banda Aceh";
 TTL.waktu.hari = 4;
*/


/*
 typedef struct tgl { int hari, bulan, tahun; } Tanggal;
 typedef struct dateofbirth { char nama[30], tempat[33]; Tanggal waktu; } DOB;
 DOB TTL[3];

 TTL[0].nama[0] = "Sai";		// <?> dibaca sbg binary
 TTL[0].waktu.bulan = 13;

 strcpy(TTL[1].nama, "Ful");
 
 DOB *t = &TTL[2];
 strcpy(t -> nama, "Sani");
 t -> waktu.tahun = 2001;
*/


/* 
swapping

 DOB temp;
 temp = TTL[0];
 TTL[0] = TTL[2];
 TTL[2] = temp;

printf("%s", TTL[2].nama);
*/

printf("\n");
return 0;
}
