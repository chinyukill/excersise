package E03;

import java.util.Scanner;

public class E03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=(int)(Math.random()*100);
		System.out.println("������Ϸ��ʼ"+num);
		Scanner sc=new Scanner(System.in);
		int a=-1;
		int count=0;
		while(a!=num) {
			a=sc.nextInt();
			
			if(a>num) {
				System.out.println("����");
			}else if(a<num) {
				System.out.println("С��");
			}
			count++;
		}
		System.out.println("�¶��ˣ�������"+count+"��");
		
		
	}

}
