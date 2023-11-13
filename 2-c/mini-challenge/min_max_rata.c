#include <stdio.h>
#include <stdlib.h>

int main()
{
  float nilai[50], min, max, sum=0, rata, jmlh;

//Meminta user untuk memasukkan banyak nilai yang akan diinput	
  printf("Jumlah data (n) : "); scanf("%f", &jmlh);

//Ketika user memasukkan banyak nilai yang akan diinput bernilai negatif atau lebih dari 50, program akan menyatakan nilai tersebut keliru dan meminta user untuk menginput ulang nilainya
  while(jmlh <= 0 || jmlh > 50)
  {
    printf("%lf adalah nilai yang keliru. Mohon input ulang nilai antara 1 sampai 50 !\n", jmlh);
    printf("Jumlah data (n) : "); scanf("%f", &jmlh);
  }

  for(int i=0; i<jmlh; i++)
  {
//Meminta user menginput nilai sebanyak banyaknya nilai yang akan diinput
    printf("Data ke %d\t: ", i+1); scanf("%f", &nilai[i]);
  }

  max = nilai[0];
  min = nilai[0];
	
//Membaca ulang nilai yang user input untuk dimasukkan kedalam rumus nilai minimum, maksimum, dan rata-rata
  for(int i=0; i<jmlh; i++)
  {
    if(nilai[i] > max)
    {
      max = nilai[i];
    }
    if(nilai[i] < min)
    {
      min = nilai[i];
    }
    sum += nilai[i];
  }	
    rata = sum/jmlh;	

//Mencetak nilai nilai minimum, maksimum, dan rata-rata dari nilai yang telah user input	
  printf("\nNilai Minimum\t: %lf\nNilai Maksimum\t: %lf\nNilai rata-rata\t: %lf", min,max,rata);
	
	
printf("\n");
return 0;
}
