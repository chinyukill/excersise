package E03;

import java.util.Scanner;

public class E03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("输入正数或负数，输入0结束");
		int sum=0;
		int num=1;
		while(num!=0) {
			num=sc.nextInt();
			sum+=num;
		}
		System.out.println(sum);
	}

}
