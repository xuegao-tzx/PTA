//6-3 简单求和 
/*
2021.10.09
23.00.00
By Xcl
*/
#include <stdio.h>

#define MAXN 10

int Sum ( int List[], int N );

int main ()
{
    int List[MAXN], N, i;

    scanf("%d", &N);
    for ( i=0; i<N; i++ )
        scanf("%d", &List[i]);
    printf("%d\n", Sum(List, N));

    return 0;
}

/* 你的代码将被嵌在这里 */
int Sum (int List[], int N)
{
    int i,Sum=0;
    for(i=0;i<N;i++)
    Sum+=List[i];
    return Sum;
}
