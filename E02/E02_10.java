package E02;
import java.util.Scanner;
public class E02_10
{
	public static void main(String[] args){
		System.out.println("请输入第一条边");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		System.out.println("请输入第二条边");
		double b=sc.nextDouble();
		System.out.println("请输入第三条边");
		double c=sc.nextDouble();
		if (a+b>c&&a+c>b&&b+c>a)
		{
			System.out.println("能组成三角形");
		}else{
			System.out.println("不能组成三角形");
		}
	}
}