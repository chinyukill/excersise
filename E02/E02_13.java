package E02;
import java.util.Scanner;
public class E02_13
{
	public static void main(String[] args){
		System.out.println("���������ڼ�");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("������˼���");
		int day=sc.nextInt()%7;
		int riqi=(num+day)%7;
		switch(riqi){
			case 1:
				System.out.println("����һ");
			break;
			case 2:
				System.out.println("���ڶ�");
			break;
			case 3:
				System.out.println("������");
			break;
			case 4:
				System.out.println("������");
			break;
			case 5:
				System.out.println("������");
			break;
			case 6:
				System.out.println("������");
			break;
			case 8:
				System.out.println("������");
			break;
		}
		
	}
}