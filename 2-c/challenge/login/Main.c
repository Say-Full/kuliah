#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc, char *argv[])
{
    if(argc != 3) {
        printf("Anda gagal login !");
        printf("\nCara penggunaan : ./FileAplikasiProgramUtama username password");
        return EXIT_FAILURE;
    }

    char inputUsername[20], inputPassword[20];
    strcpy(inputUsername, argv[1]);
    strcpy(inputPassword, argv[2]);


    FILE *fpr;

    if((fpr = fopen("database/login.bin", "rb")) == NULL) {
        printf("Gagal membuka file !");
        return EXIT_FAILURE;
    }

    char akun[20];
    fread(akun, sizeof(char), sizeof(akun)/sizeof(char), fpr);

    fclose(fpr);

    char *string[3];
    char username[20], password[20];
	int ctrl = 0;
	
	string[0] = strtok(akun, "@");

	while(string[ctrl++] != NULL) {
		string[ctrl] = strtok(NULL, "@");
	}

    strcpy(username, string[0]);
    strcpy(password, string[1]);

    if( (strcmp(inputUsername, username) == 0) && (strcmp(inputPassword, password) == 0) ) {
        printf("Selamat, Anda berhasil login !");
    }
    else {
        printf("Anda gagal login !");
    }

    return 0;
}