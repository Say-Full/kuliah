#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
 char b[50];
 char *p = &b[0];
 strcpy(b, "viruscorona");
 putchar(*++p); //lanjut ke 1, cetak ke 1 = i
 p++; // lanjut ke 2
 putchar(*p++); // cetak ke 2 = r, lanjut ke 3
 putchar((*p)++); // cetak ke 3 = u, lanjut setelah u
 putchar(*p); // cetak setelah u = v
 putchar(++(*p)); // lanjut setelah v, cetak = w
 putchar(*++p);
 putchar(--(*p));
 //++p; // lanjut ke 4
 //putchar(*++p); // lanjut ke 5, cetak ke 5 = c
 //printf("\n%s\n", b); // print akhir dr yg dirubah = u menjadi w = virwscorona

return 0;
}
