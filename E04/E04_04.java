package E04;

import java.util.Scanner;

public class E04_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		gys(num1, num2);
	}

	public static void gys(int a,int b) {
		int num=1;
		for(int i=1;i<=a;i++) {
			if (a%i==0 && b%i==0) {
				num=i;
			}
		}
		System.out.println(num);
	}
}
