#include<stdio.h>

int main()
{
    // typedef int Matriks[2][4];
    // Matriks a = ....

    // typedef float Bilangan;
    // Bilangan real;

    // int matriks[2][4] = ...

    typedef struct m {
        char *nama;
        char jk;
        int NPM;
    } Mahasiswa;

    // Tanpa typedef : struct Mahasiswa mahasiswa1;
    Mahasiswa mahasiswa[4];

    mahasiswa[0].nama = "Aufa";
    mahasiswa[0].jk = 'L';
    mahasiswa[0].NPM = 37;

    mahasiswa[1].nama = "Muna";

    printf("%d", mahasiswa[0].NPM);

    return 0;
}






/*
Typedef Struct

Typedef = Membuat tipe data alias

Struct = Kumpulan variabel-variabel (boleh beda tipe data) yang dihimpun menjadi satu

Typedef struct = Gabungan typedef dan struct




String yang sebenarnya adalah pointer yang bertipe char. 
Array adalah pointer (Array = Fixed pointer)

Saran belajar : CLA, File, Enum, goto
*/