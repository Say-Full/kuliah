#include <stdio.h>
#include <string.h>

int main()
{
	char p[80] = "M Saifullah Sani Nice";
	char *kat[2000];
	int ctrl,i;
	
	kat[0] = strtok(p, " ");
	ctrl=0;
	while(kat[ctrl] != NULL)
	{
		ctrl++;
		kat[ctrl] = strtok(NULL, " ");
	}
	
	for(i=0; i<ctrl; i++)
	{
		printf("%s\n", kat[i]);
	}

	
return 0;
}


/*
cari tw dgn strtok diisi nya kat indeks 0 atw 1 dan indeks terakhir nya karakter apa ?


ctrl++ :
i<ctrl : cetak 4 kali
i<=ctrl : tanpa hasil
i<ctrl-1 : cetak 3 kali
i<=ctrl-1 : tanpa hasil

ctrl akhir : hanya menyimpan kata kedua
i<ctrl : cetak 1 kali
i<=ctrl : cetak 2 kali
i<ctrl-1 : tanpa hasil
i<=ctrl-1 : cetak 1 kali
*/
