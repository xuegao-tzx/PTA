//6-8 简单阶乘计算
/*
2021.10.10
11.37.00
By Xcl
*/
#include <stdio.h>

int Factorial( const int N );

int main()
{
    int N, NF;

    scanf("%d", &N);
    NF = Factorial(N);
    if (NF)  printf("%d! = %d\n", N, NF);
    else printf("Invalid input\n");

    return 0;
}

/* 你的代码将被嵌在这里 */
int Factorial( const int N ){
    int a=1;
    if(N<0){
        a=0;
    }else{
        for(int i=1;i<=N;i++){
            a=a*i;
        }
    }
    return a;
}
