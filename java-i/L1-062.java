//L1-062 幸运彩票
/*
2021.11.2
18.34.50
By Xcl
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum1=0,sum2=0;
        scan.nextLine();//吃掉\n符号;
        for(int i=0;i<n;i++)
        {
        	sum1=0;
        	sum2=0;
            String str = scan.nextLine();
            char[] ch = str.toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if(j>=0&&j<ch.length-3) sum1 = sum1+ch[j]-'0';
                if(j>=ch.length-3&&j<ch.length) sum2 = sum2+ch[j]-'0';
            }
            if(sum1==sum2) System.out.printf("You are lucky!\n");
            else System.out.printf("Wish you good luck.\n");
        }
    }
}
