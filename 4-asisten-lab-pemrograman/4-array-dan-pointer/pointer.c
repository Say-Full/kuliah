#include<stdio.h>

int main()
{
    int a = 9;
    int b = 8;
    int *pointer;
    pointer = &a;

    // Harus pakai simbol & untuk mencetak alamat variabel a walaupun ada warning
    printf("Alamat variabel a : %x\n", &a);

    // Tidak perlu simbol & karena pointer itu sendiri bernilai alamat variabel a
    printf("Alamat variabel pointer : %x\n", pointer);      



    printf("\nNilai variabel a : %d\n", a);

    // Pakai operator * untuk memberikan nilai variabel yang alamatnya sedang dipegang oleh pointer
    printf("Nilai pointer yang menunjuk variabel a : %d", *pointer);
    

    /*
    // Dereferencing variabel a
    // Bermaksud "ubah nilai pada alamat yang sedang ditunjuk oleh pointer menjadi 11"
    *pointer = 11;
    printf("%d", a);

    printf("\n");

    // Dereferencing variabel b
    pointer = &b;
    *pointer = 27;

    printf("%d", b);
    */

   printf("\n");

    int angka[3] = {30, 03, 2021};
    int *pa = angka;                    // Karena pointer pa menunjuk array, tidak perlu operator &

    printf("Pointer pa menunjuk alamat angka[0] yang nilainya %d\n", *pa);
    pa++;
    printf("Pointer pa menunjuk alamat angka[1] yang nilainya %d\n", *pa);
    pa++;
    printf("Pointer pa menunjuk alamat angka[2] yang nilainya %d\n", *pa);

    return 0;
}

/*
Pointer bisa mencetak alamat memori dari variabel yang alamatnya sedang dipegang

Pointer bisa memanipulasi data dari variabel yang alamat memorinya sedang dipegang (dereferencing)

Pointer bs pindah pindah alamat variabel yang ingin dia pegang
gunakan pointer++ untuk pindah ke alamat selanjutnya (dalam array)

integer = 4 Bytes
*/