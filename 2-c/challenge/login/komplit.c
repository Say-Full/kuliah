#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc, char *argv[])
{
    if(argc != 3) {
        printf("Anda gagal login !");
        printf("\nCara penggunaan : ./namaFileUtama username password");
        return EXIT_FAILURE;
    }


    FILE *fpw = fopen("data/login.bin", "wb");
    char login[20] = "Sayfull@Code";

    fwrite(login, sizeof(char), sizeof(login)/sizeof(char), fpw);

    fclose(fpw);



    FILE *fpr;

    if((fpr = fopen("login.bin", "rb")) == NULL) {
        printf("Gagal membuka file !");
        return EXIT_FAILURE;
    }

    char akun[20];
    fread(akun, sizeof(char), sizeof(akun)/sizeof(char), fpw);

    fclose(fpr);

    // printf("%s", akun);
    char *string[3];
    char username[20], password[20];
	int ctrl = 0;
	
	string[0] = strtok(akun, "@");

	while(string[ctrl++] != NULL) {
		string[ctrl] = strtok(NULL, "@");
	}

    strcpy(username, string[0]);
    strcpy(password, string[1]);

    printf("Username : %s\nPassword : %s", username, password);

    return 0;
}