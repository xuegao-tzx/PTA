//7-8 超速判断
/*
2021.10.09
20.03.20
By Xcl
*/
#include <stdio.h>

int main()
{
    int a;
    scanf("%d",&a);
    if(a>60) printf("Speed: %d - Speeding",a);
    else printf("Speed: %d - OK",a);
    return 0;
}
