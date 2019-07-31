package E04;

import java.util.Scanner;

public class E04_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sum(num1, num2);
		
	}

	public static void sum(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
}
