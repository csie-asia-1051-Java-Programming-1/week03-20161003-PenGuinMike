package hw;
/*
 * 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 */
	import 	java.util.Scanner;
public class hw01_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.print("請輸入數字:");
			int  a,	x,	t = 0;
			x = scn.nextInt();
			a = x;
			while(a>0){
					a = a/10;
					t++;
			}System.out.println("該數值是"+t+"位數");
				
			

			
	}

}
