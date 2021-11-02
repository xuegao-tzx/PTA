//L1-031 到底是不是太胖了
/*
2021.11.2
21.49.08
By Xcl
*/
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main()
{
    int n,x;
    int a[20][2];
    int i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=0;j<2;j++){
        scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<n;i++){
        a[i][0]=(a[i][0]-100)*0.9*2;
        x=a[i][0]-a[i][1];
        if(fabs(a[i][0]-a[i][1])<a[i][0]*0.1) printf("You are wan mei!\n");
        else if(x>0) printf("You are tai shou le!\n");
        else printf("You are tai pang le!\n");
    }
}
