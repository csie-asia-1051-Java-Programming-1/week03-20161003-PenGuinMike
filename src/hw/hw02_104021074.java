package hw;
/*
 * 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 */
import java.util.Scanner;
public class hw02_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int  y = 0 ;
		int a=0 ,b = 0,c = 0;
		while(true){
		System.out.println("請輸入數字:  ");
		int  x  =  scn.nextInt();
		if(x>0){
			a++;
		}else if(x==0){
			b++;
		}else if(x<0){
			c++;
		}System.out.println("請問還要繼續輸入嗎?(Y/N): ");char check =scn.next().charAt(0);
		 if (check =='n'||	check=='N'){
			System.out.println("正數有"+a+"個"+"\t"+"零有"+b+"個"+"\t"+"負數有"+c+"個");
			break;
					}
		
		     }
	  }

}
