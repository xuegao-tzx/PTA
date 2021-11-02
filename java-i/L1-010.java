//L1-010 比较大小
/*
2021.11.2
21.28.08
By Xcl
*/
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    String[] str = reader.nextLine().split(" ");
        int[] iArray = new int[3];
	    for (int i = 0; i < iArray.length; i++) {
	        iArray[i] = Integer.parseInt(str[i]);
	    }
	    Arrays.sort(iArray);// 对指定数组的指定范围按数字升序进行排序
	    for (int j = 0; j < iArray.length; j++) {
	        if (j < iArray.length - 1) {
		        System.out.print(iArray[j]);
		        System.out.print("->");
	        } else {
		        System.out.print(iArray[j]);
	        }
        }
    }
}
