package ex;

import java.util.Scanner;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 104021074 楊永聖
 */

public class ex04_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入字串: ");
		long x = scn.nextLong();
		int sum = 0 ;
		while( x > 0){
			 sum = (int) (sum + x % 10);
			 x = x / 10;
		}System.out.print(sum);
		
	}

}
