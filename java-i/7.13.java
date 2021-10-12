//7-13 日K蜡烛图 
/*
2021.10.12
17.05.24
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        if(d<a){
            System.out.printf("BW-Solid");
            if(c<a&&c<d){
                System.out.printf(" with Lower Shadow");
                if(b>a&&b>d){
                    System.out.printf(" and Upper Shadow");
                }
            }else{
                if(b>a&&b>d){
                    System.out.printf(" with Upper Shadow");
                }
            }
        }else{
            if(d!=a){
                System.out.printf("R-Hollow");
                if(c<a&&c<d){
                    System.out.printf(" with Lower Shadow");
                    if(b>a&&b>d){
                        System.out.printf(" and Upper Shadow");
                    }
                }else{
                    if(b>a&&b>d){
                        System.out.printf(" with Upper Shadow");
                    }
                }
            }else{
                System.out.printf("R-Cross");
                if(c<a&&c<d){
                    System.out.printf(" with Lower Shadow");
                    if(b>a&&b>d){
                        System.out.printf(" and Upper Shadow");
                    }
                }else{
                    if(b>a&&b>d){
                        System.out.printf(" with Upper Shadow");
                    }
                }
            }
        }
    }
}
