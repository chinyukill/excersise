package E02;
import java.util.Scanner;
public class E02_10
{
	public static void main(String[] args){
		System.out.println("�������һ����");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		System.out.println("������ڶ�����");
		double b=sc.nextDouble();
		System.out.println("�������������");
		double c=sc.nextDouble();
		if (a+b>c&&a+c>b&&b+c>a)
		{
			System.out.println("�����������");
		}else{
			System.out.println("�������������");
		}
	}
}