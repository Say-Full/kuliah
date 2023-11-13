#include <string.h>
#include <stdio.h>

int main () {
   char str[80] = "This is - www.tutorialspoint.com - website";
   // const char s[2] = "-";

   /*
   char *token;

   token = strtok(str, s);
   // token = strtok(str, "-");

   while( token != NULL ) {
      printf( " %s\n", token );
      
      token = strtok(NULL, s);
      // token = strtok(NULL, "-");
   }
   */

   char *kat[2000];
	int ctrl, i;
	
	kat[0] = strtok(str, " ");
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

    /*
    char *kat[2000];
	int ctrl = 0, i;
	
	kat[0] = strtok(str, " ");

	while(kat[ctrl++] != NULL) {
		kat[ctrl] = strtok(NULL, " ");
	}
	
	for(i=0; i<ctrl; i++) {
		printf("%s\n", kat[i]);
	}
    */
   
   return(0);
}