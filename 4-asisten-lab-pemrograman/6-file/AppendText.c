#include<stdio.h>

int main()
{
    char text[100] = "Lab Pemrograman A";
    FILE *fptr = fopen("output.txt", "a");

    // Menulis isi ke dalam file output.txt
    fputs(text, fptr);
    


    /*
    int baris = 0;

    printf("\nMasukkan banyak baris yang ingin diinput : ");
    scanf("%d", &baris);
    getchar();

    for(int i = 0; i < baris; i++) {
        printf("Isi baris ke-%d : ", i+1);
        fgets(text, sizeof(text), stdin);
        fputs(text, fptr);
    }
    */
    



    fclose(fptr);

    return 0;
}