//L1-013 计算阶乘和
/*
2021.11.2
21.37.08
By Xcl
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				p=p*j;
			}
			sum=sum+p;
		}
		System.out.print(sum);
	}
}
