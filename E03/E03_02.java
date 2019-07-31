package E03;

import java.util.Scanner;

public class E03_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个值");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		if(a>10.0&&b<20.0) {
			double c=a+b;
			System.out.println("两个值的和为："+c);
		}
	}
}
