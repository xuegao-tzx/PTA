//7-3 逆序的三位数
/*
2021.10.09
19.25.40
By Xcl
*/
#include <stdio.h>
int main()
{
    int a, b,c,d;
    scanf("%d",&a);
    b=a/100;
    c=(a%100)/10;
    d=(a%100)%10;
    if(d==0){
        printf("%d",(b+c*10));
    }
    else{
        printf("%d",(b+c*10+d*100));
    }
    return 0;
}
