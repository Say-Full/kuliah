/calculate_postfix.c/
#include <stdio.h>
#include “stackChar.h”
#include “stackFloat.h”
#include <string.h>
#include <stdlib.h>

int prior(char x)
{
    switch(x)
    {
        case ‘)’: return 0;
        case ‘(’: return 0;
        case ‘+’: return 1;
        case ‘-’: return 1;
        case ‘*’: return 2;
        case ‘/’: return 2;   
    }
}

int prioritas(char a, char b){
    return (prior(a)>=prior(b));
}

char *konversi(char *infix){
    int i,index=0,panjang;
    char *postfix,tmpchar;
    stackChar tmp;
    
    createStackC(&tmp);
    postfix=(char *)malloc(sizeof(char)100);
    
    panjang=strlen(infix);
    for(i=0;i<panjang;i++){
        switch(infix[i]){
            case ‘0’:
            case ‘1’:
            case ‘2’:
            case ‘3’:
            case ‘4’:
            case ‘5’:
            case ‘6’:
            case ‘7’:
            case ‘8’:
            case ‘9’:
                postfix[index]=infix[i];
                index++;
                break;
            case ‘+’:
            case ‘-’:
            case ‘‘:
            case ‘/’:
                postfix[index]=’ ‘;
                index++;            
                if(isEmptyC(tmp)){
                    pushValueC(&tmp,infix[i]);
                }else if(!prioritas(info(top(tmp)),infix[i])){
                    pushValueC(&tmp,infix[i]);
                }else{
                    while(!isEmptyC(tmp)&&prioritas(info(top(tmp)),infix[i])){
                        popValueC(&tmp,&tmpchar);
                        postfix[index]=tmpchar;
                        index++;
                    }                
                    pushValueC(&tmp,infix[i]);
                }
                break;
            case ‘)’:
                while(!isEmptyC(tmp)&&info(top(tmp))!=‘(’){
                        popValueC(&tmp,&tmpchar);
                        postfix[index]=tmpchar;
                        index++;                    
                }
                popValueC(&tmp,&tmpchar);
                break;
            case ‘(’:
                pushValueC(&tmp,infix[i]);
                break;
        }
        
    }
    while(!isEmptyC(tmp)){
            popValueC(&tmp,&tmpchar);
            postfix[index]=tmpchar;
            index++;                  
    }    
    postfix[index]=’\0’;
    return postfix;
}

float calculatePostfix(char *postfix){
    int i,panjang;
    float hasil=0,tmpfloat,tmpfloat1,tmpfloat2;
    stackFloat tmp;
    
    createStackF(&tmp);    
    panjang=strlen(postfix);
    for(i=0;i<panjang;i++){
        switch(postfix[i]){
            case ‘0’:
            case ‘1’:
            case ‘2’:
            case ‘3’:
            case ‘4’:
            case ‘5’:
            case ‘6’:
            case ‘7’:
            case ‘8’:
            case ‘9’:
                tmpfloat+=((int)postfix[i]-48)1.0;   
                if(postfix[i+1]>=‘0’&&postfix[i+1]<=‘9’){
                    tmpfloat=10;
                }else{
                    pushValueF(&tmp,tmpfloat);
                    tmpfloat=0;
                }
                break;
            case ‘+’:
                popValueF(&tmp,&tmpfloat2);
                popValueF(&tmp,&tmpfloat1);
                tmpfloat1+=tmpfloat2;
                pushValueF(&tmp,tmpfloat1);
                break;
            case ‘-’:
                popValueF(&tmp,&tmpfloat2);
                popValueF(&tmp,&tmpfloat1);
                tmpfloat1-=tmpfloat2;
                pushValueF(&tmp,tmpfloat1);            
                break;
            case ‘‘:
                popValueF(&tmp,&tmpfloat2);
                popValueF(&tmp,&tmpfloat1);
                tmpfloat1=tmpfloat2;
                pushValueF(&tmp,tmpfloat1);            
                break;
            case ‘/’:
                popValueF(&tmp,&tmpfloat2);
                popValueF(&tmp,&tmpfloat1);
                tmpfloat1/=tmpfloat2;
                pushValueF(&tmp,tmpfloat1);            
                break;        
        }    
    }
    popValueF(&tmp,&hasil);
    return hasil;
}
int main()
{
    char input[100];
    char *tpostfix;
    float hasil=0;
    
    printf(“Masukkan infix : “);
    scanf(“%s”,input);
    tpostfix=konversi(input);
    printf(“notasi postfix : %s \n”,tpostfix);
    hasil=calculatePostfix(tpostfix);
    printf(“hasil perhitungan : %.2f\n”,hasil);
    return 0;
}