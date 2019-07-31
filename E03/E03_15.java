package E03;

import java.util.Scanner;

public class E03_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个数");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		int b=0;
		for(int i=0;i<m;i++) {
			if (i>=0) {
				b += (int)(Math.pow(10, i));
			}
			
			for(int j=0;j<n;j++) {
				sum+=j*b;
			}
		}
		System.out.println(sum);
	}

}
