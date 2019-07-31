package E03;

import java.util.Scanner;

public class E03_16 {

	
	//6 7 8 9
	
	//6789%10=9
	//6789/10
	
	//678%10=8
	//678/10=67
	
	//67%10=7
	//67/10=6
	
	//6%10=6
	//6/10=0
	
	//11 12 13 14 
	//1 2 3 4 
	//4 3 2 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ÊäÈëËÄÎ»");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		while (num>0) {
			count++;
			int num1=num%10;
			num=num/10;
			num1=(num1+5)%10;
			switch (count) {
			case 1:
				num1=num1*1000;
				break;
			case 2:
				num1=num1*100;
				break;
			case 3:
				num1=num1*10;
				break;
			case 4:
				num1=num1;
				break;
			default:
				break;
			}
			System.out.println(num1);
			sum+=num1;
				
			
			
		} 
		System.out.println(sum);
		
		
		
	}

}
