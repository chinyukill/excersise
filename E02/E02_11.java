package E02;
import java.util.Scanner;
public class E02_11
{
	public static void main(String[] args){
		System.out.println("����������");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age<=18&&age>0)
		{
			System.out.println("����");
		}else if (age>18&&age<=45)
		{
			System.out.println("����");
		}else if (age>45&&age<=60)
		{
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}
}