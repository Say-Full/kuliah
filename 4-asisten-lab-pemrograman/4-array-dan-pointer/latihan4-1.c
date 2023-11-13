#include<stdio.h>
#include<string.h>

int main()
{
    char nama[20];

    printf("Masukkan nama lengkap Anda : ");
    scanf(" %[^\n]", nama);

    /*
    // Kita gunakan strlen(nama)-1 agar tidak dicetak '\0'
    // Jika ingin menggunakan strlen, harus masukin (include) library string.h
    printf("Hasil balik : ");
    for(int i = strlen(nama)-1; i >= 0; i--) {
        printf("%c", nama[i]);
    }
    */

    // Jika tidak ingin menggunakan strlen, maka kita harus menghitung panjang string yang diinput
    int panjang = 0;
    for(int i = 0; nama[i] != '\0'; i++) {
        panjang++;
    }
    
    printf("Hasil balik : ");
    // Kita gunakan panjang -1 agar tidak dicetak '\0'
    for(int i = panjang-1; i >= 0; i--) {
        printf("%c", nama[i]);
    }

    return 0;
}
