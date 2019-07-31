package E02;
import java.util.Scanner;
public class E02_04
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入费用");
		double feiyong=sc.nextDouble();
		System.out.println("请输入酬金率");
		double choujinlv=sc.nextDouble();
		double sum=feiyong+feiyong*choujinlv;
		System.out.println("总费用是"+sum);
	}
}