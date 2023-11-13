#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

void merge(int arr[], int p, int q, int r)
{
    int n1 = q - p + 1;
    int n2 = r - q;
    int L[n1], M[n2];

    for(int i = 0; i < n1; i++) {
        L[i] = arr[p + i];
    }

    for(int j = 0; j < n2; j++) {
        M[j] = arr[q + 1 + j];
    }

    int i = 0, j = 0, k = p;

    while(i < n1 && j < n2) {
        if(L[i] <= M[j]) {
            arr[k] = L[i];
            i++;
        }
        else {
            arr[k] = M[j];
            j++;
        }
        k++;
    }

    while(i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while(j < n2) {
        arr[k] = M[j];
        j++;
        k++;
    }
}

void mergeSort(int arr[], int l, int r)
{
    if(l < r) {
        int m = l + (r - l) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
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
    mergeSort(angka, 0, banyakData - 1);
    waktu = clock() - waktu;

    printf("\nMerge sort %s : %ld ms\n\n", argumen[1], waktu);



    // Tulis ke dalam file output
    FILE *fpw = fopen(argumen[2], "w");

    for(int j = 0; j < i; j++) {
        fprintf(fpw, "%d\n", angka[j]);
    }

    fclose(fpw);

    return 0;
}