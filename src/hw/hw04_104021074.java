package hw;
/*
 * 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 */
import java.util.Scanner;
public class hw04_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n:");
		int n = scn.nextInt();
		int sum = 1 ;
		int i = 1;
		while(i<=n){
			sum = sum * i ;
			i++;
		}System.out.println("n!="+sum);
	}

}
