#include<stdio.h>
#define N 10

int memo[N];

int recursiveFibonacci(int n)
{
    if(n <= 1) {
        memo[n] = n;

        return memo[n];
    }
    else {
        memo[n] = recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    return memo[n];
}

int main()
{
    recursiveFibonacci(N-1);

    for(unsigned short int i = 0; i < N; i++) {
        printf("%d ", memo[i]);
    }

    return 0;
}

/*

Hitung sebanyak N fibonacci dan disimpan di dlm array memo
Angka pertama dari bilangan fibonacci adalah 0

*/