#include<stdio.h>
#define N 10

int recursiveFibonacci(int *memo, int n)
{
    if(n <= 1) {
        memo[n] = n;

        return memo[n];
    }
    else {
        memo[n] = recursiveFibonacci(memo, n-1) + recursiveFibonacci(memo, n-2);
    }

    return memo[n];
}

int main()
{
    int memo[N];

    recursiveFibonacci(memo, N-1);

    for(unsigned short int i = 0; i < N; i++) {
        printf("%d ", memo[i]);
    }

    return 0;
}

/*

Hitung sebanyak N fibonacci dan disimpan di dlm array memo
Angka pertama dari bilangan fibonacci adalah 0

*/