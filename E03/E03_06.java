package E03;

import java.util.Scanner;

public class E03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("ÊäÈën£¬¼ÆËãn!");
int n=sc.nextInt();
int num=1;
for(int i=n;i>1;i--) {
	num*=i;
}
System.out.println(num);
	}

}
