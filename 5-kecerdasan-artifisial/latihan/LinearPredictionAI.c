#include<stdio.h>
#include<string.h>

int main()
{
    char email[100];
    unsigned short int length = 0, containsAdd = 0, endsWithDotCom = 0, endsWithDotOrg = 0, jumlahHurufA = 0;
    float fractionOfAlpha = 0.0;

    printf("\nMasukkan email : ");
    scanf("%s", email);

    if(strlen(email) > 10) {
        length = 1;
    }

    for(unsigned short int i = 0; i < strlen(email); i++) {
        if(email[i] == 'A' || email[i] == 'a') {
            jumlahHurufA++;
        }
        else if(email[i] == '@') {
            containsAdd = 1;
        }
        else if(email[i] == '.' && email[i+1] == 'c' && email[i+2] == 'o' && email[i+3] == 'm') {
            endsWithDotCom = 1;
        }
        else if(email[i] == '.' && email[i+1] == 'o' && email[i+2] == 'r' && email[i+3] == 'g') {
            endsWithDotOrg = 1;
        }
    }

    // Asumsikan fraction of alpha adlh (panjang string email - banyak huruf a dan A) / panjang string email
    fractionOfAlpha = ((float) strlen(email) - jumlahHurufA) / (float) strlen(email);

    // printf("%hu %.3f %hu %hu %hu", length, fractionOfAlpha, containsAdd, endsWithDotCom, endsWithDotOrg);

    // Mengonversi fitur-fitur ke dalam bentuk vektor
    typedef struct fv
    {
        unsigned short int length;
        float fractionOfAlpha;
        unsigned short int containsAdd;
        unsigned short int endsWithDotCom;
        unsigned short int endsWithDotOrg;
    } FeatureVector;

    FeatureVector featureVector;

    featureVector.length = length;
    featureVector.fractionOfAlpha = fractionOfAlpha;
    featureVector.containsAdd = containsAdd;
    featureVector.endsWithDotCom = endsWithDotCom;
    featureVector.endsWithDotOrg = endsWithDotOrg;



    // Weight vector
    typedef struct wv
    {
        float length;
        float fractionOfAlpha;
        float containsAdd;
        float endsWithDotCom;
        float endsWithDotOrg;
    } WeightVector;

    WeightVector weightVector;

    printf("\n");
    printf("Masukkan bobot untuk fitur length>10 \t\t: ");
    scanf("%f", &weightVector.length);
    printf("Masukkan bobot untuk fitur fracOfAlpha \t\t: ");
    scanf("%f", &weightVector.fractionOfAlpha);
    printf("Masukkan bobot untuk fitur contains_@ \t\t: ");
    scanf("%f", &weightVector.containsAdd);
    printf("Masukkan bobot untuk fitur endsWith_.com \t: ");
    scanf("%f", &weightVector.endsWithDotCom);
    printf("Masukkan bobot untuk fitur endsWith_.org \t: ");
    scanf("%f", &weightVector.endsWithDotOrg);



    // Menghitung hasil Linear Prediction
    float hasil = (weightVector.length * featureVector.length) + (weightVector.fractionOfAlpha * featureVector.fractionOfAlpha) + (weightVector.containsAdd * featureVector.containsAdd) + (weightVector.endsWithDotCom * featureVector.endsWithDotCom) + (weightVector.endsWithDotOrg * featureVector.endsWithDotOrg);

    printf("\n\nHasil Linear Prediction : %.3f", hasil);

    return 0;
}