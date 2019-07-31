package E03;

import java.util.Scanner;

public class E03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("输入要逆序输出的数");
		int num=sc.nextInt();
//		int num1=0;//假定这个数是123；
		//123%10=3;
		//123/10=12;
		//12%10=2;
		//12/10=1;
		//1%10=10;
		//1/10=0
		
		int n=0;
		while(num!=0) {
			int num1=num%10;
			n=10*n+num1;
			num=num/10;
		}
		System.out.println(n);
		
	}

}
