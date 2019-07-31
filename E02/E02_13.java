package E02;
import java.util.Scanner;
public class E02_13
{
	public static void main(String[] args){
		System.out.println("请输入星期几");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("输入过了几天");
		int day=sc.nextInt()%7;
		int riqi=(num+day)%7;
		switch(riqi){
			case 1:
				System.out.println("星期一");
			break;
			case 2:
				System.out.println("星期二");
			break;
			case 3:
				System.out.println("星期三");
			break;
			case 4:
				System.out.println("星期四");
			break;
			case 5:
				System.out.println("星期五");
			break;
			case 6:
				System.out.println("星期六");
			break;
			case 8:
				System.out.println("星期七");
			break;
		}
		
	}
}