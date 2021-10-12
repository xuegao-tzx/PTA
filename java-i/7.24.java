//7-24 约分最简分式 
/*
2021.10.12
18.57.35
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		String[] str = s.split("/");//分割字符串为两个整数
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
        for(int i=b;i>2;i--){
            if((a%i==0)&&(b%i==0)){
                a=a/i;
                b=b/i;
            }
        }
        System.out.print(a+"/"+b);
    }
}