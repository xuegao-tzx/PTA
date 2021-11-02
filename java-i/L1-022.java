//L1-022 奇偶分家
/*
2021.11.2
21.43.08
By Xcl
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int j=0,o=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				o++;
			}else {
				j++;
			}
		}
		System.out.print(j+" "+o);
	}
}
