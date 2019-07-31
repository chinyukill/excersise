package E03;

import java.util.Scanner;

public class E03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("输入要转换的正整数");
		int num=sc.nextInt();
		String n="";
		while(num!=0) {
			int num1=num%2;
			n=num1+n;
			num=num/2;
			System.out.println(n);
		}
		System.out.println(n);
		
		
	}

}
