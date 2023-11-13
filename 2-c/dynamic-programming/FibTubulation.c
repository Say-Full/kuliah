#include<stdio.h>
#define N 10

int main()
{
    int memo[N] = { 0, 1 };

    for(unsigned short int i = 2; i < N; i++) {
        memo[i] = memo[i-2] + memo[i-1];
    }

    for(unsigned short int i = 0; i < N; i++) {
        printf("%d ", memo[i]);
    }


    return 0;
}