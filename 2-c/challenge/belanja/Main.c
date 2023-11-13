#include<stdio.h>
#include<conio.h>
#include<ctype.h>
#include<math.h>

typedef struct {
    char *nama;
    int harga;
} Barang;

int pilih()
{
    int pilihan = 0;

    printf("\n\n");
    printf("1. Daftar menu\n2. Belanja\n3. Keluar\n\n");
    printf("Pilihan Anda : ");
    scanf("%d", &pilihan);

    while(pilihan < 1 || pilihan > 3) {
        printf("\nMaaf, input Anda tidak sesuai !\n");
        printf("Pilihan Anda : ");
        scanf("%d", &pilihan);
    }

    return pilihan;
}

void menu()
{
    Barang barang1, barang2, barang3;

    barang1.nama = "Omelet";
    barang1.harga = 8;

    barang2.nama = "Burger telur";
    barang2.harga = 10;

    barang3.nama = "Burger telur daging";
    barang3.harga = 12;


    printf("\n\n");
    printf(" _______________________________________________\n");
    printf("+      |                                        +\n");
    printf("|  No  |   Menu                      Harga      |\n");
    printf("+______|________________________________________+\n");
    printf("|      |                                        |\n");
    printf("|  1   |  %s                      %dK        |\n", barang1.nama, barang1.harga);
    printf("|  2   |  %s               %dK        |\n", barang2.nama, barang2.harga);
    printf("|  3   |  %s        %dK        |\n", barang3.nama, barang3.harga);
    printf("|______|________________________________________|\n");
    printf("\n\n");

    printf("Tekan enter untuk lanjut... ");
    getch();
}

void transaksi(int total)
{
    int uang = 0, kembalian = 0;

    printf("\n\n");
    printf("Total belanjaan        : Rp. %d\n", total);
    printf("Masukkan uang Anda     : Rp. ");
    scanf("%d", &uang);
    
    kembalian = uang - total;

    while(kembalian < 0) {
        printf("\n");
        printf("Uang Anda kurang       : Rp. %d\n", abs(kembalian));
        printf("Masukkan uang tambahan : Rp. ");
        scanf("%d", &uang);
        kembalian = uang - abs(kembalian);
    }

    printf("\n");
    printf("Kembalian Anda         : Rp. %d\n", kembalian);
}

void belanja()
{
    int total = 0, no = 0, banyak = 0;
    char ulang = 'y';

    do {
        printf("\n");
        printf("Input nomor menu : ");
        scanf("%d", &no);

        while(no < 1 || no > 3) {
            printf("\nMaaf, input Anda tidak sesuai !\n");
            printf("Input nomor menu : ");
            scanf("%d", &no);
        }

        printf("Input banyak menu ini yang diinginkan : ");
        scanf("%d", &banyak);

        if(no == 1) {
            total += 8000 * banyak;
        }
        else if(no == 2) {
             total += 10000 * banyak;
        }
        else if(no == 3) {
            total += 12000 * banyak;
        }

        printf("\nApakah Anda ingin belanja yang lain (y/n) ? ");
        getchar();
        scanf("%c", &ulang);
        ulang = tolower(ulang);

        while(ulang != 'y' && ulang != 'n') {
            printf("\n\nMaaf, input Anda tidak sesuai !\n");
            printf("Apakah Anda ingin belanja yang lain (y/n) ? ");
            scanf("%c", &ulang);
            ulang = tolower(ulang);
        }

    } while(ulang == 'y');

    transaksi(total);
}

int main()
{
    
    int pilihan = 0;

    printf("\nSelamat datang di HexaBurg");

    while(pilihan != 3) { 
        pilihan = pilih();
        
        switch(pilihan) {
            case 1 :
                menu();
                break;
            case 2 :
                belanja();
                break;
            default :
                printf("\nTerima kasih !\nDatang lagi yaa...\n\n");
        }
    }

    return 0;
}