package E02;
import java.util.Scanner;
public class E02_07
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����ĺ�����");
		int a=sc.nextInt();
		System.out.println("�������һ�����������");
		int b=sc.nextInt();
		System.out.println("������ڶ�����ĺ�����");
		int c=sc.nextInt();
		System.out.println("������ڶ������������");
		int d=sc.nextInt();
		double x=Math.pow((c-a),2);
		double y=Math.pow((d-b),2);
		double z=Math.pow((x+y),0.5);
		System.out.println(z);


	}
}