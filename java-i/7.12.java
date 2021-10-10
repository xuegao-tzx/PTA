//7-12 两个数的简单计算器
/*
2021.10.09
21.53.25
By Xcl
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s[] = str.split("\\s+");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        if (a > 0) {
            switch (str.charAt(2)) {
                case '+':
                    System.out.print(a + b);
                    break;
                case '-':
                    System.out.print(a - b);
                    break;
                case '*':
                    System.out.print(a * b);
                    break;
                case '/':
                    System.out.print(a / b);
                    break;
                case '%':
                    System.out.print(a % b);
                    break;
                default:
                    System.out.print("ERROR");
                    break;
            }
        } else {
            int c = -a;
            String str1 = c + " " + str.charAt(3) + " " + b;
            switch (str1.charAt(2)) {
                case '+':
                    System.out.print(a + b);
                    break;
                case '-':
                    System.out.print(a - b);
                    break;
                case '*':
                    System.out.print(a * b);
                    break;
                case '/':
                    System.out.print(a / b);
                    break;
                case '%':
                    System.out.print(a % b);
                    break;
                default:
                    System.out.print("ERROR");
                    break;
            }
        }
    }
}

