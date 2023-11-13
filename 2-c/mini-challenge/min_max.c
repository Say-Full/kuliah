#include <stdio.h>

int main()
{
 float N[30], min, max;
 int data, i;
 
//meminta user menentukan banyak angka yang akan diinput
 printf("Masukkan nilai N\t: "); scanf("%d", &data);
 

//program gagal berjalan jika banyak angka yang akan user input melewati batas
 if(data < 1 || data > 30)
 {
  printf("\nNILAI N MELEWATI BATAS YANG DITETAPKAN!!");
  return 1;
 }
 
 
//memasukkan nilai ke dalam array
 printf("\nMasukkan Angka : \n");
 for(i=0; i<data; i++)
 {
  printf("%d. ", i+1); scanf("%f", &N[i]);
 }
 
 min = N[0];
 max = N[0];
 
 
//mencari nilai terkecil dan terbesar
 for(i=0; i<data; i++)
 {
  if(N[i] < min)
  min = N[i];
  
  if(N[i] > max)
  max = N[i];
 }
 
 
 printf("\nNilai minimum\t: %f", min);
 printf("\nNilai maksimum\t: %f\n", max);
	

 return 0;
}
