#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

void bubbleSort(int array[], int size)
{
    for(int step = 0; step < size - 1; ++step) {
        int swapped = 0;

        for(int i = 0; i < size - step - 1; ++i) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;

                swapped = 1;
            } 
        }

        if(swapped == 0) {
            break;
        }
    }
}

int main(int banyakArgumen, char *argumen[])
{
    // Cek CLA
    if(banyakArgumen != 3) {
        printf("\nPetunjuk : file_aplikasi nama_file_input.txt nama_file_output.txt\n");
        return 1;
    }



    // Membaca banyak data dengan cara memecah argumen[1], yaitu nama file input
    char *string[3], input[100];
    int ctrl = 0, banyakData = 0;

    strcpy(input, argumen[1]);

    string[0] = strtok(input, "_");
    while(string[ctrl++] != NULL) {
        string[ctrl] = strtok(NULL, "_");
    }

    string[0] = strtok(string[1], ".");
    banyakData = atoi(string[0]);



    // Membuka dan membaca isi file input
    FILE *fpr;

    if((fpr = fopen(argumen[1], "r")) == NULL) {
        printf("Gagal membuka file !");
        return 1;
    }

    int angka[100000], i = 0;
    char buffer[255];

    while(fgets(buffer, 255, fpr)) {
        angka[i++] = atoi(buffer);
    }

    fclose(fpr);



    // Menghitung interval waktu
    clock_t waktu;
    waktu = clock();
    bubbleSort(angka, banyakData);
    waktu = clock() - waktu;

    printf("\nBubble sort %s : %ld ms\n\n", argumen[1], waktu);



    // Tulis ke dalam file output
    FILE *fpw = fopen(argumen[2], "w");

    for(int j = 0; j < i; j++) {
        fprintf(fpw, "%d\n", angka[j]);
    }

    fclose(fpw);

    return 0;
}