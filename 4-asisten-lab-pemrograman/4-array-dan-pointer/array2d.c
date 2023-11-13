#include<stdio.h>

int main()
{
    // Kita buat matriks 4x2 (4 baris dan 2 kolom)
    int matriks[4][2] = {
                            {1, 2},     // Pengisian 2 data pada kolom matriks di baris pertama
                            {3, 4},     // Pengisian 2 data pada kolom matriks di baris kedua
                            {5, 6},     // Pengisian 2 data pada kolom matriks di baris ketiga
                            {7, 8}      // Pengisian 2 data pada kolom matriks di baris keempat
                        };

    printf("Data matriks pada baris 1 kolom 1 adalah %d \n", matriks[0][0]);
    printf("Data matriks pada baris 1 kolom 2 adalah %d \n", matriks[0][1]);
    printf("Data matriks pada baris 4 kolom 2 adalah %d \n", matriks[3][1]);

    printf("\nCetak matriks : \n");
    for(int baris = 0; baris < 4; baris++) {
        for(int kolom = 0; kolom < 2; kolom++) {
            printf("%d ", matriks[baris][kolom]);
        }
        printf("\n");
    }

    return 0;
}