package E03;

import java.util.Scanner;

public class E03_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个值！");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		if(a+b>=50) {
			System.out.println("helloworld!");
		}else {
			System.out.println("两个值的和不大于50");
		}
	}
}
