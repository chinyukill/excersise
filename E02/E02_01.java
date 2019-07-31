package E02;
import java.util.Scanner;

public class E02_01
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你现在有的钱");
		int money=(int)(sc.nextFloat()*100);
		int yuan=money/100;//2.94/1=2

		int temp=money%100;//2.94%1=0.94

		int mao5=temp/50;//0.94/0.5=1

		temp=temp%50;//0.94%0.5=0.44


		int mao2=temp/20;//0.44/0.2=2

		temp=temp%20;//0.44%0.2=0.04

		int mao1=temp/10;

		temp=temp%10;

		/*if (temp3>0.1)
		{
			int mao1=1;
		}else{
			int mao1=0;
		}*/
		int fen5=temp/5;//0.04/0.05=0

		temp=temp%5;//0.04%0.05=0.04;

		int fen2=temp/2;//0.04/0.02=2

		temp=temp%2;//0.04%0.02=0
	
		int fen1=temp/1;//
		System.out.println("一元的有"+yuan+"个;"+"5毛的有"+mao5+"个;"+"2毛的有"+mao2+"个;"+"一毛的有"+mao1+"个;"+"5分的有"+fen5+"个;"+"2分的有"+fen2+"个;"+"1分的有"+fen1+"个");

		
		

	}
}