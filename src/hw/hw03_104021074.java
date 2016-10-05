package hw;
/*
 * 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 */
import java.util.Scanner;
public class hw03_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n:");
		int n = scn.nextInt();
		int sum = 1;
		for (int i =1 ; i<=n ; i++){
			sum = sum*i;
		}System.out.println("n!="+sum);
	}

}
