package E04;

import java.util.Scanner;

public class E04_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		mul(num);
	}
	public static void mul(int num) {
		int sum=1;
		for(int i=num;i>0;i--) {
			
			sum*=i;
		}
		System.out.println(sum);
	}
}

