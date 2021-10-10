//7-3 逆序的三位数
/*
2021.10.09
19.25.40
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a/100;
        int c=(a%100)/10;
        int d=(a%100)%10;
        if(d==0){
            System.out.print(b+c*10);
        }
        else{
            System.out.print(b+c*10+d*100);
        }
    }
}
