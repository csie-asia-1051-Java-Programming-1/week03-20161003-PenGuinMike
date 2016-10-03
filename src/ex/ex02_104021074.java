package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 104021074 楊永聖
 */

public class ex02_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入字元: ");
		char x = scn.next().charAt(0);
		System.out.print((int)x);
		if(x>0&&x>=97&&x<=122){
			System.out.print("\t"+"小寫");
		}else if(x>0&&x>=65&&x<=90){
			System.out.print("大寫");
		}else{
			System.out.print("erro:404 Not Found");
		}

	}

}
