package E03;

import java.util.Scanner;

public class E03_04 {

	public static void main(String[] args) {
		System.out.println("�������˻�����");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("���������룡");
		String password=sc.next();
		if("admin".equals(name)&&"123".equals(password)) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}
	}
}
