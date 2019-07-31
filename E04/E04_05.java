package E04;

import java.util.Scanner;

public class E04_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		ss(num);
	}

	public static void ss(int num) {
		
		if (num<0) {
			System.out.println("请输入正整数");
		}else {
			if (num==0) {
				System.out.println("既不是质数也不是合数");
			}else if (num==1||num==2) {
				System.out.println("质数");
			}else {
				boolean flag=true;//质数
				for(int i=2;i<=Math.pow(num, 0.5);i++) {
					if(num%i==0) {
						flag=false;
						break;
					}
				}
				if (flag) {
					System.out.println("质数");
				}else {
					System.out.println("合数");
				}
			}
		}

		
	}
}
