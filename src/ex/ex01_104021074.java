
package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 104021074 楊永聖
 */
import java.util.Scanner;
public class ex01_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入字串: ");
		String str = scn.nextLine();
		String strB = new StringBuilder(str).reverse().toString();
		System.out.print(strB);
	}

}
