#include<stdio.h>

int main()
{
    float alas, tinggi, luas;

    printf("Masukkan nilai alas\t: ");
    scanf("%f", &alas);

    printf("Masukkan nilai tinggi\t: ");
    scanf("%f", &tinggi);

    luas = 0.5 * alas * tinggi;

    printf("Luas segitiga adalah\t: %.2f", luas);

    return 0;
}