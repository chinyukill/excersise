package E03;

import java.util.Scanner;

public class E03_09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="";
		String password="";
		int count=0;
		while(count<5) {
			System.out.println("�����˺�");
			
			name=sc.next();
			System.out.println("��������");
			password=sc.next();
			if("admin".equals(name)&&"123".equals(password)) {
				System.out.println("�ɹ�");
				break;
			}else {
				System.out.println("ʧ��");
			}
			count++;
		}
	}
}
