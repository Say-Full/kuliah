#include <stdio.h>
#include <stdlib.h>


int main()
{
/*
		Reading a file



	//FILE *stream = fopen(char *filename, char *mode)		to open the file
 FILE *fp = fopen("coba.txt", "r");

	//to check is the file exist
 if(fp == NULL)
 {
  printf("Error reading file... The file must exist first !\n");
  return EXIT_FAILURE;
 }
 else
 {
  printf("Nice, successful. And now, what do u expect ?\n");
 }



/*
int c;
	//int fgetc(FILE *stream)		to print character by character in the file to our black screen (reading a character)
 while ((c = fgetc)fp)) != EOF)
 { printf("%c", c);
*/



/*
int c;
	//int ungetc(int character, FILE *stream)	to not read a spesific character
 while ((c = fgetc(fp)) != EOF)
 {
  if (c == 'a')
  {
   ungetc('4', fp);
  }
  else
  { printf("%c", c); }		//replace every "a" as 4
 }
*/



/*
	//char *fgets(char *str, int num, FILE *stream)	to read a string (at most num-1) from a file into str that terminate by NULL, \n, EOF
 char buf[30];
 fgets(buf, 30, fp);
*/



/*
 char buf[30];
	//int feof (FILE *stream)		to check are we at the end of file. EOF = returns non-zero, !EOF = returns 0
 while(!feof(fp))
 {
  fgets(buf, 30, fp);
  printf("Read line: %s\n", buf);
 }
*/



/*
 char buf[30] = "Saiful";
 int num = 7;

 while (!feof(fp))
 {
	//int fscanf  (FILE *stream, const char * format, ...)		to read data that we know the format of the data
  fscanf(fp, "%d %s", &d, buf);
 }
*/



*/





/*
		Writing a file


 FILE *fp = fopen("coba.txt", "w");

 if(fp == NULL)
 {
  printf("Error reading file... The file must exist first !\n");
  return EXIT_FAILURE;
 }
 else
 {
  printf("Nice, successful. And now, u can write ur story !\n");
 }



/*
 char str[] = "Saiful Sani;
 int i;

 if(fp != NULL)
 {
  for (i=0; i<strlen(str); i++)		// to make every character from ur string written one by one
  {
   	//int fputc(int character, FILE *stream)	to write the character to the file
   fputc(str[i], fp)
  }
 }
*/



/*
 char str[] = "Saiful Sani";

 if(fp != NULL)
 {
	//int fputs(const char *str, FILE *stream)	to write a string to the file
  fputs(str[i], fp)
 }
*/



/*
 int a = 7;
 char str[] = "Saiful Sani";

 if(fp != NULL)
 {
  	//int fprintf (FILE *stream, const char * format, argument(s))		to write string that we know the format
  fprintf(stdout, "%d | %s", a,str);
 }
*/



*/





/*
		Error Handling


 FILE *fp = fopen("coba.txt", "w");

 if(fp == NULL)
 {
  printf("Error reading file... The file must exist first !\n");
  return EXIT_FAILURE;
 }
 else
 {
  printf("Nice, successful. And now, u can write ur story !\n");
 }



/*
 fputs("Muhammad Saifullah Sani", fp);

	//int ferror (FILE *stream)	if error = returns non-zero, otherwise = returns 0
 if(ferror(fp))		//determine was there an error
 {
  	//void perror (const char * str)	to print a description
  perror("Couldn't tell d world how i feel");

	//void clearerr (FILE *stream)		to clear the error indicator
  clearerr(fp);
 }
*/



*/





/*
		Moving around a file


 FILE *fp = fopen("coba.txt", "w");

 if(fp == NULL)
 {
  printf("Error reading file... The file must exist first !\n");
  return EXIT_FAILURE;
 }
 else
 {
  printf("Nice, successful. And now, u can write ur story !\n");
 }



/*
 	//void rewind (FILE *stream)		moves file pointer to the beginning of file, resets EOF & error indicator, forget any virtual
						characters from ungetc
 rewind(fp):
*/



/*
	//int fseek (FILE *stream, long int offset, int origin)		offset is in bytes, origin = SEEK_SET (beginning) or SEEK_CUR
									(current file position) or SEEK_END (end). resets EOF and forget
									any virtual characters from ungetc

 fputs("This is an apple.", fp);
 fseek(fp, 9, SEEK_SET);
 fputs(" sam", fp);

// Output = This is a sample
*/





*/





/*
		working with the filesystem



//int remove (const char *filename);	success = returns 0, failure = returns non-zero
//int rename (const char *oldname, const char *newname);	success = returns 0, failure = returns non-zero





*/





/*
		Binary files



 FILE *fp = fopen("coba.txt", "w");

 if(fp == NULL)
 {
  printf("Error reading file... The file must exist first !\n");
  return EXIT_FAILURE;
 }
 else
 {
  printf("Nice, successful. And now, u can write ur story !\n");
 }



/*
to open it, add "b" to the fopen mode string ==> "rb" or "wb" or "ab"
in binary file only could to write by fwrite and to read by fread
*/



/*

	//size_t fwrite (const void * ptr, size_t size, size_t count, FILE *stream)
 int nums[] = {1,2,3};
 fwrite(nums, sizeof(int), 3, fp);

 double dub = 3.1;
 fwrite(&dub, sizeof(double), 1, fp);
*/



/*
 
	//size_t fread (void * ptr, size_t size, size_t count, FILE *stream)
 int r;

 int nums[3];
 r = fread(nums, sizeof(int), 3, fp);

 double dub;
 r = fread(&dub, sizeof(double), 1, fp);
*/





*/

	//int fclose(FILE *stream)		to close the file
 fclose(fp);
return 0;
}
