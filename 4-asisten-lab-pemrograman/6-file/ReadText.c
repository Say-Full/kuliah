#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

int main()
{
    char buffer[255];
    FILE *fptr;

    // Error handling ketika membuka file dengan mode read-only
    if((fptr = fopen("input.txt", "r")) == NULL) {
        printf("Gagal membuka file !");
        // exit(1);
        return EXIT_FAILURE;
    }

    
    fgets(buffer, 255, fptr);
    printf("%s", buffer);


    /*
    while(fgets(buffer, sizeof(buffer), fptr)) {
        printf("%s", buffer);
    }
    */

    /*
    char c;
    while(((c = fgetc(fptr)) != EOF)) {
        putchar(toupper(c));
    }
    */

    fclose(fptr);

    return 0;
}

/*
Mode buka file teks : r, w, a
Mode buka file binari : rb, wb, ab

r = read-only
w = write
a = append


*/