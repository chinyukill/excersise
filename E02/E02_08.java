package E02;
//�ж�һ�����Ƕ���ˮ�ɻ���
import java.util.Scanner;
public class E02_08
{
	public static void main(String[] args)
	{
		System.out.println("������һ����λ��");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ge=num%10;
		int shi=num/10%10;
		int bai=num/100;
		int sxh=(int)(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3));
		if (sxh==num)
		{
			System.out.println("����һ��ˮ�ɻ���");
		}else{
			System.out.println("�ⲻ��һ��ˮ�ɻ���");
		}
	}
}