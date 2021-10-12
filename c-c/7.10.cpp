//7-10 计算工资
/*
2021.10.12
08.43.18
By Xcl
*/
#include <stdio.h>

int main(){
    float a, b;
    scanf("%f %f",&a,&b);
    if(a>=5){
        if(b<=40){
            printf("%.2f",50*b);
        }else{
            printf("%.2f",(50*1.5*(b-40)+50*40));
        }
    }else{
        if(b<=40){
            printf("%.2f",30*b);
        }else{
            printf("%.2f",(30*1.5*(b-40)+30*40));
        }
    }
    return 0;
}
