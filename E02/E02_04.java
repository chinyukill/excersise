package E02;
import java.util.Scanner;
public class E02_04
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("���������");
		double feiyong=sc.nextDouble();
		System.out.println("����������");
		double choujinlv=sc.nextDouble();
		double sum=feiyong+feiyong*choujinlv;
		System.out.println("�ܷ�����"+sum);
	}
}