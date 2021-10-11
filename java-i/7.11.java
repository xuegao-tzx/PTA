//7-11 分段计算居民水费
/*
2021.10.11
22.18.42
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        if(a<=15){
            b=(4*a)/3;
        }else{
            b=2.5*a-17.5;
        }
        System.out.printf("%.2f",b);
    }
}
