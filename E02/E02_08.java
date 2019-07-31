package E02;
//判断一个数是都是水仙花数
import java.util.Scanner;
public class E02_08
{
	public static void main(String[] args)
	{
		System.out.println("请输入一个三位数");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ge=num%10;
		int shi=num/10%10;
		int bai=num/100;
		int sxh=(int)(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3));
		if (sxh==num)
		{
			System.out.println("这是一个水仙花数");
		}else{
			System.out.println("这不是一个水仙花数");
		}
	}
}