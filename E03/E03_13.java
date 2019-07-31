package E03;

import java.util.Scanner;

public class E03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("输入你要判断的数");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=2;
		boolean flag=true;
		while(n<=Math.pow(num, 0.5)) {
			if(num%n==0) {
				flag=false;
				break;
			}
			n++;
		}
		if(flag) {
			System.out.println("质数");
		}else {
			System.out.println("合数");
		}
	}

}
