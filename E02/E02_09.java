package E02;
//�ж�ĳ���Ƿ�������
import java.util.Scanner;

public class E02_09
{
	public static void main(String[] args){
		//����һ�򣬰���һ���İ�������
		System.out.println("������һ�����");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if ((year%4==0&&year%100!=0)||year%400==0)
		{
			System.out.println("����");
		}else{
			System.out.println("��������");
		}
	}
}