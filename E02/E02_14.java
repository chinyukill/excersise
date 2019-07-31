package E02;
import java.util.Scanner;
public class E02_14
{
	public static void main(String[] args){
		System.out.println("输入一个时间");
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		int second=sc.nextInt();
		second--;
		if (second<0)
		{
			second=59;
			minute--;
			if (minute<0)
			{
				minute=59;
				hour--;
				if (hour<0)
				{
					hour=23;
				}
			}
		}
		System.out.println(hour+":"+minute+":"+second);

	}
}