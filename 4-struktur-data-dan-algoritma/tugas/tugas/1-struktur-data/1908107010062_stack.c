#include<stdio.h> 
#include<string.h> 
#include<ctype.h>
#define SIZE 50

char stack[SIZE]; 
int top = -1; 
int stack_int[SIZE]; 
int top_int = -1;

void push(char item)
{
   stack[++top] = item; 
} 

char pop()
{
   return stack[top--]; 
} 

void push_int(int item)
{
   stack_int[++top_int] = item; 
} 

int pop_int()
{
   return stack_int[top_int--]; 
} 

int precedence(char operator)
{
   switch(operator) { 
      case '*': 
      case '/':
         return 2; 
         break; 
      case '+': 
      case '-':
         return 1; 
         break;
      default:
         return 0;
   } 
} 

int isOperator(char symbol)
{
    switch(symbol) {
        case '+': 
        case '-': 
        case '*': 
        case '/': 
        case '(': 
        case ')':
            return 1; 
            break; 
        default:
            return 0; 
   } 
} 

void konversi(char infix[],char postfix[]) {
    int j = 0;

    for(int i = 0; i < strlen(infix); i++) {
        if(!isOperator(infix[i])) {
            postfix[j++] = infix[i];
        }
        else if(infix[i] == '(') {
                push(infix[i]); 
        }
        else if(infix[i] == ')') {
            while(stack[top] != '(') {
                postfix[j++] = pop();
            }
            
            pop();
        }
        else if(isOperator(infix[i])) {
            if(precedence(infix[i]) > precedence(stack[top])) {
                push(infix[i]); 
            }
            else {
                while(precedence(infix[i]) <= precedence(stack[top])) {
                    postfix[j++] = pop();
                } 
                    
                push(infix[i]); 
            }
        }
    }

    while(top != -1) {
        postfix[j++] = pop();
    } 

    postfix[j] = '\0'; 
} 

int hitung(char *postfix){
    int operan1, operan2, hasil;

    for(int i = 0; i < strlen(postfix); i++) {
        hasil = 0;

        if(isdigit(postfix[i])) {
            while(isdigit(postfix[i])) {
                hasil *= 10;
                hasil += (postfix[i] - '0');
                i++;
            };
            i--;
            push_int(hasil);
        }
        else if(postfix[i] == ' ') {
            continue;
        }
        else if(isOperator(postfix[i])) {
            operan2 = pop_int();
            operan1 = pop_int();
            
            switch(postfix[i]) {
                case '+':
                    push_int(operan1 + operan2);
                    break;
                case '-':
                    push_int(operan1 - operan2);
                    break;
                case '*':
                    push_int(operan1 * operan2);
                    break;
                case '/':
                    push_int(operan1 / operan2);
                    break;
            }
        } 
    }

    return stack_int[top_int];
}

int main()
{
    char postfix[SIZE], infix[SIZE] = "(p + q) / r - (s + t * u)";

    printf("Notasi infix\t\t: %s\n" , infix);
    konversi(infix,postfix); 
    printf("Notasi postfix\t\t: %s\n" , postfix);
    printf("Hasil perhitungan\t: %d\n" , hitung(postfix));

    return 0;
}
