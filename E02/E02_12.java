package E02;
import java.util.Scanner;
public class E02_12
{
	public static void main(String[] args){
		System.out.println("´Ó¼üÅÌÖÐÊäÈë£»");
			Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if (a>=48&&a<=57)
		{
			System.out.println("Êý×Ö");
		}else if (a>=65&&a<=90)
		{
			System.out.println("´óÐ´×ÖÄ¸");
		}else if (a>=97&&a<=122)
		{
			System.out.println("Ð¡Ð´×ÖÄ¸");
		}
	}
}