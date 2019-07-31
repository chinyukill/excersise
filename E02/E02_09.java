package E02;
//判断某年是否是闰年
import java.util.Scanner;

public class E02_09
{
	public static void main(String[] args){
		//四年一闰，百年一闰，四百年再闰；
		System.out.println("请输入一个年份");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if ((year%4==0&&year%100!=0)||year%400==0)
		{
			System.out.println("闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
}