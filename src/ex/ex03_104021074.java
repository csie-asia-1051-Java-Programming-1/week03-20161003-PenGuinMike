package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 104021074 楊永聖
 */
import java.util.Scanner;
public class ex03_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入字元:");
		char x = scn.next().charAt(0);
		//System.out.println((int)x);
		if(x>0&&x>=97&&x<=122){
			int y = x-32;
			System.out.print("轉換為:"+(char)y);
		}else if(x>0&&x>=65&&x<=90){
			int y = x+32;
			System.out.print("轉換為:"+(char)y);
		}else{
			System.out.print("erro:404 Not Found");
		}
		
		
	}

}
