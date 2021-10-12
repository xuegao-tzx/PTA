//7-13 日K蜡烛图 
/*
2021.10.12
16.51.30
By Xcl
*/
#include <stdio.h>

int main(){
    float a,b,c,d;
    scanf("%f %f %f %f",&a,&b,&c,&d);
    if(d<a){
        printf("BW-Solid");
        if(c<a&&c<d){
            printf(" with Lower Shadow");
            if(b>a&&b>d){
                printf(" and Upper Shadow");
            }
        }else{
            if(b>a&&b>d){
                printf(" with Upper Shadow");
            }
        }
    }else{
        if(d!=a){
            printf("R-Hollow");
            if(c<a&&c<d){
                printf(" with Lower Shadow");
                if(b>a&&b>d){
                    printf(" and Upper Shadow");
                }
            }else{
                if(b>a&&b>d){
                    printf(" with Upper Shadow");
                }
            }
        }else{
            printf("R-Cross");
            if(c<a&&c<d){
                printf(" with Lower Shadow");
                if(b>a&&b>d){
                    printf(" and Upper Shadow");
                }
            }else{
                if(b>a&&b>d){
                    printf(" with Upper Shadow");
                }
            }
        }
    }
}