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
			System.out.println("������������");
		}else {
			if (num==0) {
				System.out.println("�Ȳ�������Ҳ���Ǻ���");
			}else if (num==1||num==2) {
				System.out.println("����");
			}else {
				boolean flag=true;//����
				for(int i=2;i<=Math.pow(num, 0.5);i++) {
					if(num%i==0) {
						flag=false;
						break;
					}
				}
				if (flag) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
			}
		}

		
	}
}
