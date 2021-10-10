//7-12 两个数的简单计算器
/*
2021.10.09
20.15.15
By Xcl
*/
#include <stdio.h>
int main(){
    int a,b;
    char c;
    scanf("%d %c %d",&a,&c,&b);
    switch(c){
        case('+'):printf("%d",a+b);break;
        case('-'):printf("%d",a-b);break;
        case('*'):printf("%d",a*b);break;
        case('/'):printf("%d",a/b);break;
        case('%'):printf("%d",a%b);break;
        default:printf("ERROR\n");
    }
    return 0;
}
