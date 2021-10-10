//7-8 超速判断
/*
2021.10.09
20.08.06
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>60) System.out.print("Speed: "+a+" - Speeding");
        else System.out.print("Speed: "+a+" - OK");
    }
}
