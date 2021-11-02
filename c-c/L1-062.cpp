//L1-062 幸运彩票
/*
2021.11.2
18.34.50
By Xcl
*/
#include<stdlib.h>
#include<string.h>
int main()
{
    int n;
	int i;
    scanf("%d", &n);
    getchar();
    for(i=0;i<n;i++)
    {
        char a[7];
        gets(a);
        if (a[0] + a[1] + a[2] == a[3] + a[4] + a[5])
            printf("You are lucky!");
        else
            printf("Wish you good luck.");
        printf("\n");
    }
    return 0;
}
