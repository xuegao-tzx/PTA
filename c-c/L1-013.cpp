//L1-013 计算阶乘和
/*
2021.11.2
21.32.08
By Xcl
*/
#include<stdio.h>
int main()
{
	int n;
	int num=1,sum=0;
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		num=1;
		for(int j=1;j<=i;j++)
			num*=j;
		sum+=num;
	}
	printf("%d",sum);
	return 0;
}
