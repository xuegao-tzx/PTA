//7-24 约分最简分式 
/*
2021.10.12
18.38.30
By Xcl
*/
#include <stdio.h>

int main(){
    int a, b;
    scanf("%d/%d",&a,&b);
    for(int i=b;i>=2;i--){
        if((a%i==0)&&(b%i==0)){
            a=a/i;
            b=b/i;
        }
    }
    printf("%d/%d",a,b);
    return 0;
}