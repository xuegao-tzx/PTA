//7-11 分段计算居民水费
/*
2021.10.11
22.09.50
By Xcl
*/
#include <stdio.h>

int main(){
    double a;
    double b;
    scanf("%lf",&a);
    if(a<=15){
        b=(4*a)/3;
    }else{
        b=2.5*a-17.5;
    }
    printf("%.2f",b);
    return 0;
}
