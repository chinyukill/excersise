package E02;
import java.util.Scanner;
public class E02_11
{
	public static void main(String[] args){
		System.out.println("请输入年龄");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age<=18&&age>0)
		{
			System.out.println("少年");
		}else if (age>18&&age<=45)
		{
			System.out.println("青年");
		}else if (age>45&&age<=60)
		{
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
	}
}