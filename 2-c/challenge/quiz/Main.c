#include<stdio.h>
#include<conio.h>
#include<ctype.h>
#define BANYAKSOAL 3

int soal(int nomor)
{
    char jawab;

    if(nomor == 1) {
        printf("1. Pertanyaan nomor 1 ?\nA. a\nB. b\nC. c\nD. d\n");
        printf("\nJawab : ");
        getchar();
        scanf("%c", &jawab);

        if(toupper(jawab) == 'A') {
            printf("\nSelamat, jawaban Anda benar !");
            getch();
            return 10;
        }
        else {
            printf("\nJawaban Anda salah !");
            getch();
            return 0;
        }
    }
    else if(nomor == 2) {
        printf("2. Pertanyaan nomor 2 ?\nA. a\nB. b\nC. c\nD. d\n");
        printf("\nJawab : ");
        getchar();
        scanf("%c", &jawab);

        if(toupper(jawab) == 'B') {
            printf("\nSelamat, jawaban Anda benar !");
            getch();
            return 20;
        }
        else {
            printf("\nJawaban Anda salah !");
            getch();
            return 0;
        }
    }
    else {
        printf("3. Pertanyaan nomor 3 ?\nA. a\nB. b\nC. c\nD. d\n");
        printf("\nJawab : ");
        getchar();
        scanf("%c", &jawab);

        if(toupper(jawab) == 'C') {
            printf("\nSelamat, jawaban Anda benar !");
            getch();
            return 30;
        }
        else {
            printf("\nJawaban Anda salah !");
            getch();
            return 0;
        }
    }
}

int minimum(int nilai[])
{
    int min = nilai[0];

    for(int i = 0; i < BANYAKSOAL; i++) {
        if(nilai[i] <= min) {
            min = nilai[i];
        }
    }

    return min;
}

int maksimum(int nilai[])
{
    int maks = 0;

    for(int i = 0; i < BANYAKSOAL; i++) {
        if(nilai[i] >= maks) {
            maks = nilai[i];
        }
    }

    return maks;
}

float rata(int nilai[])
{
    float sum = 0;

    for(int i = 0; i < BANYAKSOAL; i++) {
        sum += nilai[i];
    }

    return sum / BANYAKSOAL;
}

void game()
{
    int nilai[BANYAKSOAL], min = 0, maks = 0;
    float rat = 0.0;

    printf("\n\n-------------- Permainan dimulai --------------\n\n");
    for(int i = 0; i < BANYAKSOAL; i++) {
        nilai[i] = soal(i+1);
        printf("\n\n");
    }

    min = minimum(nilai);
    maks = maksimum(nilai);
    rat = rata(nilai);

    printf("Nilai terkecil yang Anda dapat : %d\n", min);
    printf("Nilai terbesar yang Anda dapat : %d\n", maks);
    printf("Nilai rata - rata Anda         : %.2f\n", rat);
}

int main()
{
    char username[20] = " ";
    int ulang = 0;

    printf("\nSelamat datang di QuizGame");
    printf("\nUsername : ");
    scanf("%s", username);
    printf("\nSelamat menikmati game ini, %s ! ", username);
    getch();

    do {
        game();
        printf("\nTekan enter untuk lanjut... ");
        getch();

        printf("\n\n1. Restart\n2. Quit\nNote : Mohon untuk tidak menginput selain angka !\n");
        printf("\nPilihan : ");
        scanf("%d", &ulang); 

        while(ulang < 1 || ulang > 2) {
            printf("Maaf, input Anda tidak sesuai !\n");
            printf("\nPilihan : ");
            scanf("%d", &ulang);
        }
    } while(ulang != 2);

    return 0;
}