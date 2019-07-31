package E03;

import java.util.Scanner;

public class E03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("输入当前红绿灯颜色");
		String color=sc.next();
		switch(color) {
		case "红":
			System.out.println("停");
			break;
		case "绿":
			System.out.println("通过");
			break;
		case "黄":
			System.out.println("等");
			break;
		
		}
	}

}
