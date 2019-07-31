package E02;
import java.util.Scanner;
public class E02_05
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int num=sc.nextInt();
		int ge=num%10;
		int shi=num/10%10;
		int bai=num/100;
		System.out.println(bai+shi+ge);
	}
}