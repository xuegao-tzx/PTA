//7-10 计算工资
/*
2021.10.12
08.50.01
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a>=5){
            if(b<=40){
                System.out.printf("%.2f",50*b);
            }else{
                System.out.printf("%.2f",(50*1.5*(b-40)+50*40));
            }
        }else{
            if(b<=40){
                System.out.printf("%.2f",30*b);
            }else{
                System.out.printf("%.2f",(30*1.5*(b-40)+30*40));
            }
        }
    }
}
