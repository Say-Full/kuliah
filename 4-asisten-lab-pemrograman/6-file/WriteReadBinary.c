#include<stdio.h>
#include<stdlib.h>

int main()
{
    // Menulis file binari
    FILE *fpw = fopen("obin.bin", "wb");    // Pointer untuk menulis file binari

    float angka = 9.9;
    fwrite(&angka, sizeof(float), 1, fpw);

    int bilangan[] = {2, 7, 9};
    fwrite(bilangan, sizeof(int), 3, fpw);

    // Tutup stream
    fclose(fpw);



    // Membaca file binari 
    FILE *fpr;    // Pointer untuk membaca file binari

    if((fpr = fopen("obin.bin", "rb")) == NULL) {
        printf("Gagal membuka file !");
        return EXIT_FAILURE;
    }

    // Menyimpan isi file binari
    float cetakAngka;
    fread(&cetakAngka, sizeof(float), 1, fpr);

    int cetakBilangan[3];
    fread(cetakBilangan, sizeof(int), 3, fpr);


    // Mencetak ke monitor
    printf("Angka : %f", cetakAngka);

    printf("\n\nBilangan :");
    for(int i = 0; i < 3; i++) {
        printf(" %d", cetakBilangan[i]);
    }

    fclose(fpr);

    return 0;
}