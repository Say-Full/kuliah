#include<stdio.h>
#include<string.h>

int main()
{
    char nama[20], cari, ubah;
    char *p = nama;

    printf("Input nama : ");
    scanf(" %[^\n]s", nama);
    getchar();
    printf("Input karakter yang dicari : ");
    scanf("%c", &cari);
    getchar();
    printf("Input karakter hasil ubah : ");
    scanf("%c", &ubah);

    // for(int i = 0; i < strlen(nama); i++) {
    //     if(nama[i] == cari) {
    //         nama[i] = ubah;
    //     }
    // }

    for(int i = 0; i <= strlen(nama); i++, p++) {
        if(*p == cari) {
            *p = ubah;
        }
    }

    printf("Hasil : %s", nama);

    return 0;
}


/*

Postest :

Ubah karakter tertentu dalam sebuah String (array of char)
menjadi karakter yang diinginkan

Contoh :
nama = Mori
Karakter yang ingin diubah = i
Menjadi : a

Hasil = Mora

Petunjuk : Gunakan array dan konsep dereferencing (pointer)


*/