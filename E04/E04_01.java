package E04;

import java.util.Scanner;

public class E04_01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int grade=sc.nextInt();
		gradeLevel(grade);
		
	}

	public static void gradeLevel(int grade) {
		if(grade>90&&grade<=100) {
			System.out.println("A");
		}else if (grade>80&&grade<=90) {
			System.out.println("B");
		}else if (grade>70&&grade<=80) {
			System.out.println("C");
		}else if (grade>60&&grade<70) {
			System.out.println("D");
		}else if (grade<=60) {
			System.out.println("E");
		} else {
			System.out.println("请输入正确成绩");
		} 
	}
}
