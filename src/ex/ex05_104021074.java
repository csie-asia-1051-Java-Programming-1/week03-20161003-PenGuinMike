package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 104021074 楊永聖
 */
import java.util.Scanner;
public class ex05_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數: ");
		long a = scn.nextLong();
		if(a%2!=0){
			System.out.print("奇數!");
		}else if(a%2==0){
			System.out.print("偶數!");
		}
	}

}
