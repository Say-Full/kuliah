#include<stdio.h>

int main()
{
    int pilihan;

    printf("Menu");
    printf("\n1. Makanan");
    printf("\n2. Minuman");
    printf("\nMasukkan pilihan Anda : ");
    scanf("%d", &pilihan);  

    /*
    //if - else if - else
    if(pilihan == 1) {
        printf("Donat");
    }
    else if(pilihan == 2) {
        printf("Thai tea");
    }
    else {
        printf("Maaf, input Anda tidak sesuai");
    }
    */
    






    /*
    //switch - case
    switch(pilihan) {
        case 1 : printf("Donat");
        break;

        case 2 : printf("Thai tea");
        break;

        default : printf("Maaf, input Anda tidak sesuai");
    }
    */



    /*
    //ternary
    (pilihan == 1 || pilihan == 2) ? ((pilihan == 1) ? printf("Donat") : printf("Thai tea")) : printf("Maaf, input Anda tidak sesuai");
    */

    return 0;
}
