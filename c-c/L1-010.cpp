//L1-010 比较大小
/*
2021.11.2
21.32.08
By Xcl
*/
#include<stdio.h>
#include<math.h>
int main()
{
    int a,b,c,temp;
    scanf("%d %d %d",&a,&b,&c);
    if(a>b)
    {
        temp=a;
        a=b;
        b=temp;
    }
    if(a>c)
    {
        temp=a;
        a=c;
        c=temp;
    }
    if(b>c)
    {
        temp=b;
        b=c;
        c=temp;
    }
    printf("%d->%d->%d",a,b,c);
    return 0;
}
