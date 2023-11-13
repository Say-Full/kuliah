#include<stdio.h>
#include<string.h>

int main()
{
    char nama[30];

    printf("Masukkan nama Anda : ");
    scanf(" %[^\n]", nama);

    // Kita gunakan strlen(nama)-1 agar tidak dicetak '\0'
    // Jika ingin menggunakan strlen, harus masukin (include) library string.h
    for(int i = strlen(nama) - 1; i >= 0; i--) {
        printf("%c", nama[i]);
    }
    
    printf("%p", nama[30]);
    return 0;
}


/*
String = array of char
Maksudnya, tipe data string itu adalah tipe data yang terbentuk dari sekumpulan karakter (array dari karakter)

Jika kita deklarasikan sebuah variabel yang bertipe data string lalu kita isi nilai ke dalam variabel tersebut :
char nama[20] = "Hai";

Maka, dalam array nama tersebut isinya adalah :
nama[0] = 'H'
nama[1] = 'a'
nama[2] = 'i'
nama[3] = '\0'

Program secara otomatis menambahkan '\0' di ujung array nya karena variabel nama bertipe string.
'\0' digunakan untuk menandakan akhir dari string

NULL sedikit berbeda dengan '\0' tapi seringnya disamakan
NULL = integer
'\0' = pointer

Ketika bermain dengan pointer tidak bisa menggunakan NULL, coba ubah menjadi '\0'

Kita tidak menggunakan simbol & ketika menyimpan String
karena array itu sendiri adalah sebuah pointer
*/

