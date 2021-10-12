//7-9 用天平找小球
/*
2021.10.12
09.13.16
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b){
            if(b!=c){
                System.out.printf("C");
            }
        }else{
            if(b==c){
                System.out.printf("A");
            }else{
                System.out.printf("B");
            }
        }
    }
}
