//7-9 用天平找小球
/*
2021.10.12
09.13.16
By Xcl
*/
#include <stdio.h>

int main(){
    int a, b,c;
    scanf("%d %d %d",&a,&b,&c);
    if(a==b){
        if(b!=c){
            printf("C");
        }
    }else{
        if(b==c){
            printf("A");
        }else{
            printf("B");
        }
    }
    return 0;
}
