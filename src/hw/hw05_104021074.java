package hw;
/*
 * 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 */
import java.util.Scanner;
public class hw05_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n:");
		int n = scn.nextInt();
		int sum = 0  ;
		int i ;
		for(i =1 ; i <=n; i++){
			int a= sum;
			sum = i*(i+1);
			sum = sum +a;
		}System.out.println("總和為:"+sum);
	}

}
