//L1-022 奇偶分家
/*
2021.11.2
21.43.08
By Xcl
*/
#include<stdio.h>
int main()
{
    int N;
    int x,i=0,j;
    scanf("%d",&N);
    j = N;
    while(N > 0)
    {
        scanf("%d",&x);
        if(x % 2 == 0)
            i++;
            N--;
    }
    printf("%d %d", j-i,i );
    return 0;
}
