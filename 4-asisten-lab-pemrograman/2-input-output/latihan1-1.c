#include<stdio.h>

int main()
{
    float r, volumeBola;

    printf("Masukkan nilai jari-jari : ");
    scanf("%f", &r);

    volumeBola = 4.0/3.0 * 22.0/7.0 * r * r * r;

    printf("Volume bolanya adalah %f", volumeBola);

    return 0;
}