package E03;

import java.util.Scanner;

public class E03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������Ҫ�жϵ���");
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
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	}

}
