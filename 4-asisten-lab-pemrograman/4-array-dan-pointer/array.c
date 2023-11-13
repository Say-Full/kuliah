#include<stdio.h>

int main()
{
    int angka[5] = {1, 8, 9, 11, 12};
    /*
    // Sama aja dengan
    int angka[5];
    angka[0] = 1;
    angka[1] = 8;
    angka[2] = 9;
    angka[3] = 11;
    angka[4] = 12;
    */

    printf("Nilai variabel angka pada indeks 0 adalah %d\n", angka[0]);
    
    // Mencetak setiap elemen dalam array angka
    for(int i = 0; i < angka; i++) {
        printf("\nNilai pada indeks %d adalah %d", i, angka[i]);
    }

    
    return 0;
}

/*
Array bermain dengan indeks yang ditandai dengan []

Jika kita deklarasikan array dengan ukurannya 5, maka elemen terakhir dalam array tersebut berada
di indeks 4 karena array dimulai dari indeks 0

Array adalah fixed pointer. Ingat bahwa array juga pointer.
Array juga bermain dengan alamat memori. Tetapi alamat memori array tidak bisa berubah.
Sedangkan pointer bisa menunjuk alamat memori yang berbeda-beda.

Jika ada array int angka[3];
Maka, dlm memori (RAM), asumsikan :
angka[0] berada pada alamat memori 2020
angka[1] berada pada alamat memori 2024
angka[2] berada pada alamat memori 2028

Jadi, alamat memori angka[0] akan selalu tetap 2020, tidak bisa berpindah menjadi 2036 atau lainnya. 
Begitu juga alamat memori angka[1] dan angka[2]

Alasan mengapa masing-masing alamat memori angka[0] adalah 2020, angka[1] adalah 2024, dan angka[2] 2028
yang mana selisih 4 adalah karena ukuran memori yang disediakana untuk menyimpan data bertipe integer
adalah 4 Bytes.
*/

