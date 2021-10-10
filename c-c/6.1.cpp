//6-1 简单输出整数
/*
2021.10.10
11.24.50
By Xcl
*/
#include <stdio.h>

void PrintN ( int N );

int main ()
{
    int N;

    scanf("%d", &N);
    PrintN( N );

    return 0;
}

/* 你的代码将被嵌在这里 */
void PrintN ( int N ){
    for(int i=1;i<=N;i++){
        printf("%d\n",i);
    }
}
