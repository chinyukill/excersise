package E02;
import java.util.Scanner;
public class E02_07
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个点的横坐标");
		int a=sc.nextInt();
		System.out.println("请输入第一个点的纵坐标");
		int b=sc.nextInt();
		System.out.println("请输入第二个点的横坐标");
		int c=sc.nextInt();
		System.out.println("请输入第二个点的纵坐标");
		int d=sc.nextInt();
		double x=Math.pow((c-a),2);
		double y=Math.pow((d-b),2);
		double z=Math.pow((x+y),0.5);
		System.out.println(z);


	}
}